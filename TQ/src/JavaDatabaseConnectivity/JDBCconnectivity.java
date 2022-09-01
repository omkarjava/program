package JavaDatabaseConnectivity;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCconnectivity
{
	static Connection conn;
	static ResultSet spstRs;
	static ResultSet depRs;
	static ResultSet sporRs;
	
	void DisplayStudentData()
	{
		try {
			Statement stmt=conn.createStatement();
			spstRs=stmt.executeQuery("select * from student");
			while(spstRs.next())
			{
				System.out.println(spstRs.getInt(1)+" "+spstRs.getString("sname")
				+" "+spstRs.getInt(3)+" "+spstRs.getInt(4)+" "+spstRs.getInt(5));
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	}
	void SportData()
	{
		Statement spmt;
		try {
			spmt = conn.createStatement();
			sporRs=spmt.executeQuery("select * from sports");
			while(sporRs.next())
			{
				System.out.println(sporRs.getInt(1)+" "+sporRs.getString(2));
				
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	void DeaptmentData()
	{
		Statement sdmt;
		try {
			sdmt = conn.createStatement();
			depRs=sdmt.executeQuery("select * from department");
			while(depRs.next())
			{
				System.out.println(depRs.getInt(1)+" "+depRs.getString(2)+" "+depRs.getInt(3));
				
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	void insertStudentData(int id,String n,int m,int d,int s)
	{
		try {
			Statement st=conn.createStatement();
			String query="insert into student values("+id+",'"+n+"',"+m+","+d+","+s+")";
			// int i=st.executeUpdate("insert into student values()12,'gita',55,12,444)");
			int i=st.executeUpdate(query);
			if(i!=0)
			{
				System.out.println("Record Insertade");
			}
		    } 
		
		catch (SQLException e)
		   {
			
			e.printStackTrace();
	    	}
		
	}
	
	void updateStudentData()
	{
		try {
			Statement st=conn.createStatement();
			int i=st.executeUpdate("update student set smarks=90 where sid=8");
			if(i!=0)
			System.out.println("Record Updated");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	void DeleteStudentData()
	{
		try {
			Statement st=conn.createStatement();
			int i=st.executeUpdate("delete from student where sid=3");
			if(i!=0)
			System.out.println("Record deleted");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
//		Scanner sc =new Scanner(System.in);
//		System.out.println("enter id name marks deid sports");
//		int i=sc.nextInt();
//		String n=sc.next();
//		int m=sc.nextInt();
//	    int d=sc.nextInt();
//		int s=sc.nextInt();
		conn=DBconnection.getconnection1();
		
		JDBCconnectivity jdbc=new JDBCconnectivity();
		//jdbc.insertStudentData(i, n, m, d, s);
		
		jdbc.updateStudentData();
		jdbc.DeleteStudentData();
		jdbc.DisplayStudentData();
		System.out.println();
		jdbc.SportData();
		System.out.println();
		jdbc.DeaptmentData();
		
	}
	
}


     






