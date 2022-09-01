    package JavaDatabaseConnectivity;

    import java.sql.CallableStatement;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.sql.Types;

    public class Bike 
    {
	
	static Connection co;
	//1.	Create a stored procedure to get the full name of customer whose cust_id is provided as input.
	void procedureCall()
	{
		try
		{
			CallableStatement stmt=co.prepareCall("{call Fullname(12,?,?)}");
			stmt.registerOutParameter(1, Types.VARCHAR);
			stmt.registerOutParameter(2, Types.VARCHAR);
			stmt.execute();
			String s=stmt.getNString(1);
			String i=stmt.getNString(2);
			System.out.println(s+" "+i);
			
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
	}
	
//	2.	WAQ to get the number of complaints registered for model electra.
  
	void displayData()
	{
		try
		{
			PreparedStatement pstmt=co.prepareStatement("select count(purchase_id) from purchase where model_id=(select model_id from model where model_name like 'electra') and rating_id=(select rating_id from feedbackrating where rating like 'complaint');  ");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
			    System.out.println(rs.getInt(1));
			}
		} 
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}
	}
	// 5.	Update ratings given by Mr Vaibhav from good to excellent.
	void updateData()
	{
		try 
		{
			PreparedStatement stmt=co.prepareStatement("update purchase set rating_id=(select rating_id from feedbackrating where rating like 'excellent') where cust_id=(select cust_id from customer where first_name like 'sachin'); ");
			
			
			int i=stmt.executeUpdate();
			if(i!=0)
				
				System.out.println("Record Updated");
			
			
		} 
		catch (SQLException e) 
		{
	
			e.printStackTrace();
		}
	}
	
//	reduce cost by 10% if rating is bad
	
	void reduce()
	{
		try 
		{
			PreparedStatement stmt=co.prepareStatement("update model set cost=(cost-(cost*0.10)) where model_id =(select model_id from purchase where rating_id=(select rating_id from feedbackrating where rating like 'bad'));");
			
			
			int i=stmt.executeUpdate();
			if(i!=0)
				
				System.out.println("Record Updated");
			
			
		} 
		catch (SQLException e) 
		{
	
			e.printStackTrace();
		}
	}
	
//	4.	Delete all complaint records from purchase. 
	void delete()
	{
		try 
		{
			PreparedStatement pstmt=co.prepareStatement("delete from purchase where rating_id=(select rating_id from feedbackrating where rating like 'complaint')");
			
			int i=pstmt.executeUpdate();
			if(i!=0)
				System.out.println("Record Deleted");
			
			
		} 
		catch (SQLException e) 
		{
	
			e.printStackTrace();
		}
	}
	
//	3.	WAQ to get all customer names who haven’t given ratings yet. 
	
	void rating()
	{
		try 
		{
			Statement stmt=co.createStatement();
		
			
			ResultSet rs= stmt.executeQuery("select first_name from customer where cust_id in (select cust_id from purchase where rating_id is null)");
			
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
	
	public static void main(String[] args) 
	{
         co=Assignment.getconnection();
		 Bike b=new  Bike ();
		 b.procedureCall();
         b.updateData();
		 b.displayData();
		 b.reduce();
		 b.delete();
		 b.rating();
	}

}
