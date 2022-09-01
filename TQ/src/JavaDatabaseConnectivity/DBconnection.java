package JavaDatabaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

	
	static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/newdabasedb";
	static String username="root";
	static String password="root";
	static Connection conn;
	
	static Connection getconnection1()
	{
		try {
			Class.forName(driver);
			System.out.println("Driver Loaded");
			conn=DriverManager.getConnection(url, username, password);
			System.out.println("Connection Sucessful");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	
	
	
}
