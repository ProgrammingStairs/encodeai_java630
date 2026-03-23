package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample4 {
	static int countDb(Statement stmt) throws SQLException{
		int count=0;
		String query = "select count(*) as database_count from INFORMATION_SCHEMA.SCHEMATA";
		ResultSet rs = stmt.executeQuery(query);
		if(rs.next())
			count = rs.getInt(1);
		return count;
	}
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
			System.out.println("con holds object of : "+con.getClass().getName());
			int dbOldCount=0,dbNewCount=0;
			if(con!=null)
				System.out.println("Connection established successfully");
			Statement stmt = con.createStatement();
			
				dbOldCount = countDb(stmt);
			
			String query1 = "create database if not exists advance6301";
			stmt.execute(query1);
			
				dbNewCount = countDb(stmt);
			
			if(dbNewCount>dbOldCount)
				System.out.println("Database created successfully");
			else
				System.out.println("Database already exist");
			
		}catch(ClassNotFoundException | SQLException e) {
				System.out.println("Exception : "+e);
		}
	}

}




