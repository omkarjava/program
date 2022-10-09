package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Account {
	
	
	static Connection conn;
	PreparedStatement ps;
	ResultSet accno;
	ResultSet balance;
	void user(int accno,String username,String password)
	{
		boolean p=Password.checkpassword(password);
		if(p==true)
		{
			
			try 
			{
				ps=conn.prepareStatement("insert into user values (?,?,?)");
				ps.setInt(1, accno);
				ps.setString(2,username);
				ps.setString(3, password);
				int i=ps.executeUpdate();
				if(i!=0)
				{
					System.out.println("username password is set");
				}
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		}
	}
	     int accountNumber()
		{
			try
			{
			 ps=conn.prepareStatement("select accno from account order by accno desc limit 1");
			 ResultSet accno=ps.executeQuery();
			 while(accno.next())
			 { 
				return accno.getInt(1);
			 }
			}
			 catch (SQLException e) 
			 {
				e.printStackTrace();
			 }
			return 0;
		}
	     
	     
	  void createAccount(int accno,String name,String address,int balance)   
	  {
		  try
		  {
			ps=conn.prepareStatement("insert into account values (?,?,?,?)");
			ps.setInt(1, accno);
			ps.setString(2, name);
			ps.setString(3, address);
			ps.setInt(4, balance);
			int i=ps.executeUpdate();
			if(i!=0)
			{
				System.out.println("Account Open Sucessfully");
			}
			
		  } 
		   catch (SQLException e)
		   {
			
			e.printStackTrace();
		   }
	  }	  
	void checkBalance(int accno)
	{
		 try 
		 {
			ps=conn.prepareStatement("select balance from account where accno=?");
			ps.setInt(1, accno);
			ResultSet balance=ps.executeQuery();
			while(balance.next())
			{
				System.out.println("Balance is"+balance.getInt(1));
			}
		 } 
		 catch (SQLException e) 
		 {
		
        	e.printStackTrace();
		 }
	}
		  
		  
	void Deposit(int accno,int amount)
	{
		try 
		{
			ps=conn.prepareStatement("update account set balance=balance+? where accno=?");
			ps.setInt(1, amount);
			ps.setInt(2, accno);
			int s=ps.executeUpdate();
			if(s!=0)
			{
				System.out.println("Deposit sucessfully");
			}
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
	}
		  
	void transferMoney(int accno,int amount,int pay)
	{
		
	}
		  
	int checkpassword(String username,String password)
	{
		try {
			ps=conn.prepareStatement("select accno from user where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet accno=ps.executeQuery();
			while(accno.next())
			{
				return accno.getInt(1);
			}
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
	}
		  
		  
		  
		  
		  
	  }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	
	
	
	
	
	

	

