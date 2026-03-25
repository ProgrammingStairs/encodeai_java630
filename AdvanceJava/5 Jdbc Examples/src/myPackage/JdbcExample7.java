package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample7 {
	public static void main(String[] args) {
		try {
			Connection con = GetConnection.getConnect();
			String username="Peter Parker";
			String email="peter@gmail.com";
			String password="12345678";
			String address="Indore, Madhya Pradesh";
			
			String query = "insert into user(username,email,password,address) values('"+username+"','"+email+"','"+password+"','"+address+"')";
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(query);
			if(i==0)
				System.out.println("Error while inserting data : "+i);			
			else
				System.out.println("Data inserted successfully : "+i);
		}catch(Exception e) {
				System.out.println("Exception : "+e);
		}
	}

}
