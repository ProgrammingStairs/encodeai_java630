package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample5 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance630", "root", "root");
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
