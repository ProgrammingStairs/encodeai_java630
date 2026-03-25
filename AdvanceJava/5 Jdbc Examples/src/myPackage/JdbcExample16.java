package myPackage;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample16 {
	public static void main(String[] args) {
		try {
			Connection con = GetConnection1.getConnect();
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println("DriverName : "+dbmd.getDriverName());
			System.out.println("DriverVersion : "+dbmd.getDriverVersion());
			System.out.println("DatabaseProductName : "+dbmd.getDatabaseProductName());
			System.out.println("DatabaseProductVersion : "+dbmd.getDatabaseProductVersion());

			String query = "select * from customer";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("TableName : "+rsmd.getTableName(1));
			System.out.println("ColumnClassName : "+rsmd.getColumnClassName(1));
			System.out.println("ColumnCount : "+rsmd.getColumnCount());
			System.out.println("ColumnName : "+rsmd.getColumnName(2));

			
		}catch(Exception e) {
				System.out.println("Exception : "+e);
		}
	}

}
