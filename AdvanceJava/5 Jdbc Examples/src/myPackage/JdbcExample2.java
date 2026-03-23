package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			System.out.println("con holds object of : "+con.getClass().getName());
			if(con!=null)
				System.out.println("Connection established successfully");
			String query = "create database if not exists advance630";
			Statement stmt = con.createStatement();
			stmt.execute(query);
			System.out.println("Database created successfully");
			
		}catch(ClassNotFoundException | SQLException e) {
				System.out.println("Exception : "+e);
		}
	}

}
