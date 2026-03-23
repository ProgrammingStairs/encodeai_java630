package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			System.out.println("con holds object of : "+con.getClass().getName());
			int dbOldCount=0,dbNewCount=0;
			if(con!=null)
				System.out.println("Connection established successfully");
			Statement stmt = con.createStatement();
			String query = "select count(*) as database_count from INFORMATION_SCHEMA.SCHEMATA";
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next())
				dbOldCount = rs.getInt(1);
			
			String query1 = "create database if not exists advance6301";
			Statement stmt1 = con.createStatement();
			stmt1.execute(query1);
			
			String query2 = "select count(*) as database_count from INFORMATION_SCHEMA.SCHEMATA";
			ResultSet rs2 = stmt.executeQuery(query2);
			if(rs2.next())
				dbNewCount = rs2.getInt(1);
			
			if(dbNewCount>dbOldCount)
				System.out.println("Database created successfully");
			else
				System.out.println("Database already exist");
			
		}catch(ClassNotFoundException | SQLException e) {
				System.out.println("Exception : "+e);
		}
	}

}



