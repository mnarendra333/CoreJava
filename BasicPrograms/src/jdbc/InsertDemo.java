package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {
	
	public static void main(String[] args) {
		
		Connection connection = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system", "system");
		
			stmt = connection.createStatement();
			int count = 
					stmt.executeUpdate
("insert into elec values(3,'lenovo-pd-600-16GB',1000,20,'pendrives','lenovo')");
			System.out.println(count+" rows inserted");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			try {
				stmt.close();
				connection.clearWarnings();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
	}

}
