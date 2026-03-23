package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample9 {
	public static void main(String[] args) {
		try {
			Connection con = GetConnection1.getConnect();
			String email="andrew@gmail.com";
			
			String query = "delete from user where email='"+email+"'";
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(query);
			if(i==0)
				System.out.println("Error while deleting data : "+i);			
			else
				System.out.println("Data deleted successfully : "+i);
		}catch(Exception e) {
				System.out.println("Exception : "+e);
		}
	}

}
