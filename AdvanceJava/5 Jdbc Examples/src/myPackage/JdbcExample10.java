package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample10 {
	public static void main(String[] args) {
		try {
			Connection con = GetConnection1.getConnect();
			
			String query = "select * from user";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
//			System.out.println(rs);
			while(rs.next()) {
				System.out.println("\nuid : "+rs.getInt(1));
				System.out.println("username : "+rs.getString(2));
				System.out.println("email : "+rs.getString(3));
				System.out.println("password : "+rs.getString(4));
				System.out.println("address : "+rs.getString(5));
			}
		}catch(Exception e) {
				System.out.println("Exception : "+e);
		}
	}

}
