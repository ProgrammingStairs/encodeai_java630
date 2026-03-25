package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample15 {
	public static void main(String[] args) {
		try {
			Connection con = GetConnection1.getConnect();
			
//			String query = "select customer.cust_id,customer.cust_name,orders.order_id,orders.amount  from customer join orders on customer.cust_id=orders.cust_id";
			
			String query = "select customer.cust_id,customer.cust_name,orders.order_id,orders.amount  from customer left join orders on customer.cust_id=orders.cust_id";
			
			PreparedStatement ps = con.prepareStatement(query);
			System.out.println("\n---------------------------------------------------------\n");
			System.out.println("Cust_id \t Cust_name \t\tOrder_id \t Amount");
			System.out.println("\n---------------------------------------------------------\n");

			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getInt(3)+"\t\t"+rs.getInt(4));
			}
		}catch(Exception e) {
				System.out.println("Exception : "+e);
		}
	}

}
