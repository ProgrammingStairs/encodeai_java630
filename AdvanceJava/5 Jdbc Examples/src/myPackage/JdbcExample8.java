package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample8 {
	public static void main(String[] args) {
		try {
			Connection con = GetConnection1.getConnect();
			String username="Andrew Anderson New";
			String email="andrew@gmail.com";
			String password="123";
			String address="Indore";
			
			String query = "update user set username='"+username+"',password='"+password+"',address='"+address+"' where email='"+email+"'";
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(query);
			if(i==0)
				System.out.println("Error while updating data : "+i);			
			else
				System.out.println("Data updated successfully : "+i);
		}catch(Exception e) {
				System.out.println("Exception : "+e);
		}
	}

}
