package myPackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection1{
	
	static Connection getConnect() {
		Connection con = null;
		try {
			Class.forName(GetDetails.DRIVER);
			con = DriverManager.getConnection(GetDetails.URL,GetDetails.USER,GetDetails.PASS);
			if(con!=null)
				System.out.println("Connection established successfully");
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println("Exception : "+e);
		}
		return con;
	}
}