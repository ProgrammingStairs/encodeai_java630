package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class JdbcExample11 {
	public static void main(String[] args) {
		try {
			Connection con = GetConnection.getConnect();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Username : ");
			String username=sc.nextLine();
			
			System.out.println("Enter Email : ");
			String email=sc.next();
			
			System.out.println("Enter Password : ");
			String password=sc.next();
			
			sc.nextLine();
			System.out.println("Enter Address : ");
			String address=sc.nextLine();
			
			String query = "insert into user(username,email,password,address) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, address);
			
			int i = ps.executeUpdate();
			if(i==0)
				System.out.println("Error while inserting data : "+i);			
			else
				System.out.println("Data inserted successfully : "+i);
		}catch(Exception e) {
				System.out.println("Exception : "+e);
		}
	}

}


	

