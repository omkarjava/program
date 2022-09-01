package JavaDatabaseConnectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementExample {
	
	static Connection c;
	static ResultSet rs;
	
	void showtable()
	{
		try 
		{
			PreparedStatement pstmt=c.prepareStatement("show tables");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
		} 
		catch (SQLException e)
		{
		
			e.printStackTrace();
		}
		
	}
	void displayData()
	{
		try
		{
			PreparedStatement pstmt=c.prepareStatement("select*from student");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
			    System.out.println(rs.getInt(1)+" "+rs.getString("sname")
				+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
			}
		} 
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
		 
	}
	void insertData(int i,String n,int m,int d,int s)
	{
		try {
			PreparedStatement pstmt=c.prepareStatement("insert into student values(?,?,?,?,?)");
			pstmt.setInt(1, i);
			pstmt.setString(2, n);
			pstmt.setInt(3, m);
			pstmt.setInt(4, d);
			pstmt.setInt(5, s);
			
			int i1=pstmt.executeUpdate();
			if(i1!=0)
				System.out.println("Record Inserted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	void updateData(int id,int marks,int did,int sid)
	{
		try 
		{
			PreparedStatement pstmt=c.prepareStatement("update student set  smarks=?,did=?,spid=? where sid=? ");
			
			pstmt.setInt(1, marks);
			pstmt.setInt(2, did);
			pstmt.setInt(3, sid);
			pstmt.setInt(4, id);
			
			int i=pstmt.executeUpdate();
			if(i!=0)
				System.out.println("Record Updated");
			
			
		} 
		catch (SQLException e) 
		{
	
			e.printStackTrace();
		}
	}
	void DeleteData(int id)
	{
		try 
		{
			PreparedStatement pstmt=c.prepareStatement("delete from student where sid=?");
			pstmt.setInt(1, id);
			int i=pstmt.executeUpdate();
			if(i!=0)
				System.out.println("Record Deleted");
			
			
		} 
		catch (SQLException e) 
		{
	
			e.printStackTrace();
		}
	}
	
 // Delete Record On Joins
	void DeleteData(String dname)
	{
		try 
		{
			PreparedStatement pstmt=c.prepareStatement("delete s from student s inner join department d on s.did=d.did  where dname=?");
			pstmt.setString(1, dname);
			int i=pstmt.executeUpdate();
			if(i!=0)
				System.out.println("Record Deleted");
			
			
		} 
		catch (SQLException e) 
		{
	
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter The Database");
	 String Database=sc.next();
	 
	 c= DatabaseConnection.getconnection(Database);
	 
	 PreparedStatementExample pse=new PreparedStatementExample();
//	 System.out.println("Enter Student info (id,name,marks,departmentid,sid)");
//	 int i=sc.nextInt();
//	 String n=sc.next();
//	 int m=sc.nextInt();
//	 int d=sc.nextInt();
//	 int s=sc.nextInt();
//	  pse.insertData(i, n, m, d, s);
//		
		System.out.println("/n---------------------------/n");
		pse.displayData();
//		System.out.println("write id ,marks ,did,sid");
//		int id=sc.nextInt();
//		int m=sc.nextInt();
//		int d=sc.nextInt();
//		int s=sc.nextInt();
//		pse.updateData(id,m,d,s);
		
//		System.out.println("Enter id To Delete REcord");
//		int id=sc.nextInt();
//
//		pse.DeleteData(id);
		
		System.out.println("Enter Department name To Delete REcord");
		String dep=sc.next();
		pse.DeleteData(dep);
		pse.displayData();
		
		//pse.showtable();

	}

}
