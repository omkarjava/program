    package com.controller;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Accountimplementor implements Accountinterfase {
    	
    	static PreparedStatement ps;
		
    	public void addAccount(Account obj)
    	{
    		
    		try 
    		{
    			ps=Transaction.conn.prepareStatement("insert into account value (?,?,?,?,?,?)");
				ps.setInt(1, obj.accno);
				ps.setString(2, obj.username);
	    		ps.setString(3, obj.ifsccode);
	    		ps.setInt(4, obj.balance);
	    		ps.setInt(5, obj.mobileno);
	    		ps.setString(6, obj.email);
	    		int i=ps.executeUpdate();
	    		if(i!=0)
	    		{
	    			System.out.println("Account Added Sucessfully");
	    		}
			}
    		catch (SQLException e) 
    		{
				
				e.printStackTrace();
			}
    		
    		
    	}

    	public void checkBalance(String username)
    	{
    		 try
    		 {
				ps=Transaction.conn.prepareStatement("select balance from account where username=?");
				ps.setString(1, username);
				ResultSet balance=ps.executeQuery();
				while(balance.next())
				{
					System.out.println("Your Balance is:"+balance.getInt(1));
				}
			
				
			 } 
    		 catch (SQLException e)
             {
				
				e.printStackTrace();
			 }
    	}
    	
    	
    	
    	public void addMoney(String username,int amount)
    	{
    		
    		
    		try 
    		{
    			
    			ps=Transaction.conn.prepareStatement("update account set balance=balance+? where username=?");
    			ps.setInt(1, amount);
    			ps.setString(2, username);
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
    	
    	public void transferBalance(String username,int amount,String payusername)throws MinumumFundRequiredException
    	{
    		
    		try 
    		{
    			ps=Transaction.conn.prepareStatement("select balance from account where username=?");
				ps.setString(1, username);
				ResultSet balance=ps.executeQuery();
				while(balance.next())
				{
					
					if(balance.getInt(1)-amount<500)
					{
						
					 throw new MinumumFundRequiredException("Mininmun 500 is Required In Account Unsafficient Fund To Transfer The Amount...");
					}
					else
					{
						try {
    			        ps=Transaction.conn.prepareStatement("update account set balance=balance-? where username=? ");
    			        ps.setInt(1, amount);
    			        ps.setString(2, username);
    		
    			        int s=ps.executeUpdate();
    			        if(s!=0 )
    			        {
    				     System.out.println("Transfer sucessfully");
    			
    				     addMoney( payusername, amount);
    			       }
    			      else
    			      {
    			    	  System.out.println("Entered Wrong Username");
    			      }
						}
						catch (SQLException e) 
			    		{
			    			
			    			e.printStackTrace();
			    			
			    		}
						
    		         } 
				}
    		}
    		catch (SQLException e) 
    		{
    			
    			e.printStackTrace();
    			
    		}
    	}
    	
    	public void WithDrawMoney(String username,int amount)throws MinumumFundRequiredException
    	{
    		
    		try 
    		{
    			ps=Transaction.conn.prepareStatement("select balance from account where username=?");
				ps.setString(1, username);
				ResultSet balance=ps.executeQuery();
				while(balance.next())
				{
					
					if(balance.getInt(1)-amount<500)
					{
						
					 throw new MinumumFundRequiredException("Mininmun 500 is Required In Account Unsafficient Fund to WithDrawMoney the Amount...");
					}
					else
					{
    		           try 
    		           {	
    			        ps=Transaction.conn.prepareStatement("update account set balance=balance-? where username=?");
    			        ps.setInt(1, amount);
    			        ps.setString(2, username);
    			        int s=ps.executeUpdate();
    			        if(s!=0)
    			        {
    				     System.out.println("WithDraw sucessfully");
    			        } 
    			        else
    			        {
    			        	System.out.println("Please Enter Correct  Username");
    			        }
    			        
    		          } 
    		          catch (SQLException e) 
    		          {
    			        e.printStackTrace();
    		          }
    		           
    	            }
					
				}
				}
    		catch (SQLException e) 
	          {
		        e.printStackTrace();
	          }
    		
    		}

}
