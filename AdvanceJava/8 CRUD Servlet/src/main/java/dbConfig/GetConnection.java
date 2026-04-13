package dbConfig;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
	public static Connection getConnect() {
		Connection con = null;
		try {
				Class.forName(GetDetails.DRIVER);
				con = DriverManager.getConnection(GetDetails.URL, GetDetails.USER, GetDetails.PASS);
				if(con!=null)
					System.out.println("Connection established successfully");
		}catch(Exception e) {
				System.out.println("Exception : "+e);
		}
		return con;
	}
}
