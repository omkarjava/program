package JavaDatabaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/";
	static String username="root";
	static String password="root";
	static Connection c;
	
	static Connection getconnection(String Database)
	{
		try {
			Class.forName(driver);
			System.out.println("Driver Loaded");
			url=url+Database;
			c=DriverManager.getConnection(url, username, password);
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
		return c;
	}
	
	

	public static void main(String[] args) {
	
	}

}
