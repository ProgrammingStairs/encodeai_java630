package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample19 {
	public static void main(String[] args) {
		try {
			Connection con = GetConnection1.getConnect();
			
			String query = "select * from user";
//			String query = "select * from user where uid=3";
			PreparedStatement ps = con.prepareStatement(query,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				if(rs.getInt(1)==2) {
					rs.updateString(2, "Andrew Peter new");
					rs.updateRow();
				}
				System.out.println("\nuid : "+rs.getInt(1));
				System.out.println("username : "+rs.getString(2));
				System.out.println("email : "+rs.getString(3));
				System.out.println("password : "+rs.getString(4));
				System.out.println("address : "+rs.getString(5));
			}
		}catch(Exception e) {
				System.out.println("Exception : "+e);
		}
	}

}
