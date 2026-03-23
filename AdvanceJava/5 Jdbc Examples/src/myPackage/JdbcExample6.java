package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample6 {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/advance630";
	private static final String USER = "root";
	private static final String PASS = "root";
	public static void main(String[] args) {
		try {
			Class.forName(DRIVER);
			Connection con = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("con holds object of : "+con.getClass().getName());
			if(con!=null)
				System.out.println("Connection established successfully");
			
			String query = "create table if not exists user(uid int not null primary key auto_increment,username varchar(45) not null,email varchar(45) not null,password varchar(45) not null,address varchar(45) not null)";
			Statement stmt = con.createStatement();
			stmt.execute(query);
			System.out.println("Table created successfully");
			
		}catch(ClassNotFoundException | SQLException e) {
				System.out.println("Exception : "+e);
		}
	}

}
