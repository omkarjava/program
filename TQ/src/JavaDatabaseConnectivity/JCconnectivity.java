ppackage JavaDatabaseConnectivity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JCconnectivity {
	static Connection c;
	
	static ResultSet s;
	
	void updateCountryData(String na,int id)
	{
		try 
		{
			Statement st=c.createStatement();
			String d="update countries set country_name= '"+na+"' where country_id="+ id + "";
			int i=st.executeUpdate(d);
			if(i!=0)
			System.out.println("Record Updated");
			
			
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
		
	}
	
	void addData(int id ,String country)
	{
		try
		{
			Statement st=c.createStatement();
		}
		catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Country name id");
		String na=sc.next();
		int i=sc.nextInt();
		c=DatabaseConnection.getconnection();
		
		JCconnectivity jc=new JCconnectivity ();
		
		jc.updateCountryData(na,i);
		
		

	}

}
