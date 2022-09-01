package JavaDatabaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Assignment 
{
	static String driver="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/bikedb";
	static String username="root";
	static String password="root";
	
	static Connection co;
	
	static Connection getconnection()
	{
		try
		{
			Class.forName(driver);
			System.out.println("DriverLoaded");
			co=DriverManager.getConnection(url,username,password);
			System.out.println("connection sucessful");
		} 
		catch (ClassNotFoundException e)
		{
			
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return co;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
