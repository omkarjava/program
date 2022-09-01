package JavaDatabaseConnectivity;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Date;
import java.util.Scanner;

public class CallableStatementExample {
	
	static Connection c;
	void functionCall(int id)
	{
		try 
		{
			CallableStatement stmt=c.prepareCall("{?=call FullName(?)}");
			stmt.registerOutParameter(1, Types.VARCHAR);
			stmt.setInt(2, id);
		    stmt.execute();
		    String sc=stmt.getNString(1);
		    System.out.println(sc);
		}
        catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
	}
	
	void procedureCall(int id)
	{
		try 
		{
			CallableStatement stmt=c.prepareCall("{Call EmpNameSalary(100,?,?)}");
//			stmt.setInt(1, id);
			stmt.registerOutParameter(1, Types.VARCHAR);
			stmt.registerOutParameter(2, Types.INTEGER);
			stmt.execute();
			String s=stmt.getNString(1);
			int i=stmt.getInt(2);
			System.out.println(s+" "+i);
			
			
		} 
		catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
	}
	
	void call()
	{
		CallableStatement stmt;
		try {
			stmt = c.prepareCall("{call new_procedure(100,?,?,?}");
			stmt.registerOutParameter(1, Types.VARCHAR);


			
			stmt.registerOutParameter(2, Types.INTEGER);
			stmt.execute();
			String s=stmt.getNString(1);
			int i=stmt.getInt(2);
			Date d=stmt.getDate(3);
			System.out.println(s+" "+i+" "+d);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		c=DBconnection.getconnection1();
		CallableStatementExample cs=new CallableStatementExample();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		cs.functionCall(id);
        cs.procedureCall(id);
        cs.call();
	} 

}
