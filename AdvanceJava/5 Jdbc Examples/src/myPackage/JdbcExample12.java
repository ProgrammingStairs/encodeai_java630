package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class JdbcExample12 {
	public static void main(String[] args) {
		try {
			Connection con = GetConnection.getConnect();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Email whose data you want to update : ");
			String email=sc.next();
			sc.nextLine();
			System.out.println("Enter Username : ");
			String username=sc.nextLine();
			
			System.out.println("Enter Password : ");
			String password=sc.next();
			
			sc.nextLine();
			System.out.println("Enter Address : ");
			String address=sc.nextLine();
			
			String query = "update user set username=?,password=?,address=? where email=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, address);
			ps.setString(4, email);

			int i = ps.executeUpdate();
			if(i==0)
				System.out.println("Error while updating data : "+i);			
			else
				System.out.println("Data updated successfully : "+i);
		}catch(Exception e) {
				System.out.println("Exception : "+e);
		}
	}

}


	

