package JavaDatabaseConnectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ScrollableResultSet {
	
	static Connection conn;
	static ResultSet rs;
	static PreparedStatement stmt;
	void StudentData()
	{
		try 
		{
			stmt=conn.prepareStatement("select*from student",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs=stmt.executeQuery();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Done");
	}
    void forwardTraverse()
    {
    	try 
    	{
			rs.beforeFirst();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)
				                   +" "+rs.getInt(4)+" "+rs.getInt(5));
			}
		}
    	catch (SQLException e) 
    	{
			
			e.printStackTrace();
		}
    	System.out.println("forward traverse");
    }
        
    void backwardTraverse() 
    {
    		try 
    		{
				rs.afterLast();
				while(rs.previous())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)
	                +" "+rs.getInt(4)+" "+rs.getInt(5));
				}
			}
    		catch (SQLException e) 
    		{
				
				e.printStackTrace();
			}
			
		System.out.println("Backward traverse");
    }
	
    void traverseSpecificRow()
    {
    	try 
    	{
			rs.absolute(3);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)
				                   +" "+rs.getInt(4)+" "+rs.getInt(5));
			}
			
		} 
    	catch (SQLException e)
    	{
		
			e.printStackTrace();
		}
    	System.out.println("Traverse Row");
    	
    }
    
     void insertData()
     {
    	 try 
    	 {
			rs.moveToInsertRow();
			rs.updateInt(1, 30);
			rs.updateString(2, "aashu");
			rs.updateInt(3, 80);
			rs.updateInt(4, 103);
			rs.updateInt(5, 20);
			rs.insertRow();
			
			
	   	} 
    	 catch (SQLException e) 
    	 {
			
			e.printStackTrace();
		}
    	 System.out.println("Insertion is Done");
     }
     
      void deleteData()
      {
    	  try {
			rs.absolute(5);
			rs.deleteRow();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  System.out.println("Deleted Done");
      }
	 void updateData(int id)
	 {
		 try 
		 {
			while(rs.next())
			 {
				 if(rs.getInt(1)==id)
				 {
					 rs.updateInt(3, 99);
					 rs.updateRow();
				 }
			 }
	  	} 
		 catch (SQLException e)
		 {
			
			e.printStackTrace();
		}
		 System.out.println("updation complete");
	 }
	 
	 void firstLstRow()
	 {
		 try
		 {
			rs.first();
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)
            +" "+rs.getInt(4)+" "+rs.getInt(5));
			
			rs.last();
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)
            +" "+rs.getInt(4)+" "+rs.getInt(5));
			
			
		} 
		 catch (SQLException e)
		 {
			
			e.printStackTrace();
		}
		 
	 }
	public static void main(String[] args) throws SQLException {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter The Database");
		 String Database=sc.next();
        conn=DatabaseConnection.getconnection(Database);
		ScrollableResultSet sr=new ScrollableResultSet();
		
		 sr.StudentData();
		
	    System.out.println();
	    
		sr.backwardTraverse();
//		
//		System.out.println();
//		sr.traverseSpecificRow();
//		System.out.println();
//		//sr.insertData();
//		System.out.println();
 //       sr.forwardTraverse();
//		System.out.println();
//        sr.deleteData();
//        System.out.println();
//		sr.updateData(30);
//		System.out.println();
//		//sr.firstLstRow();
	}

}
