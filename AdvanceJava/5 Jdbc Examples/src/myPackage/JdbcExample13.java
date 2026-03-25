package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class JdbcExample13 {
	public static void main(String[] args) {
		try {
			Connection con = GetConnection.getConnect();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Email whose data you want to delete : ");
			String email=sc.next();
			String query = "delete from user where email=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, email);

			int i = ps.executeUpdate();
			if(i==0)
				System.out.println("Error while deleting data : "+i);			
			else
				System.out.println("Data deleted successfully : "+i);
		}catch(Exception e) {
				System.out.println("Exception : "+e);
		}
	}

}


	

