package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Userimplimentor implements Userinterfase{
	 
	PreparedStatement ps;
	public void adduser(User u) 
	{
		try
		{
			ps=Transaction.conn.prepareStatement("insert into users values (?,?,?)");
			ps.setString(1,u.username);
			ps.setString(2, u.password);
			ps.setString(3, u.role);
			int i=ps.executeUpdate();
			if(i!=0)
			{
				System.out.println("username password role is set");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void updateuser(String username,String password)
	{
		
		try
		{
			ps=Transaction.conn.prepareStatement("update users set password=? where username=?");
			ps.setString(1,password);
			ps.setString(2, username);
			int i=ps.executeUpdate();
			if(i!=0)
			{
				System.out.println(" password is Updated Sucessfully");
			}
			else
			{
				System.out.println("Wrong Username");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	public void deleteuser(String username)
	{
		try
		{
			ps=Transaction.conn.prepareStatement("Delete from users  where username=?");
			ps.setString(1, username);
			int i=ps.executeUpdate();
			if(i!=0)
			{
				System.out.println("Deleted Sucessfully");
			}
			else
			{
				System.out.println("Wrong Username ");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	 
	  boolean login(String username,int pass)
	 {
		 
		 String s=" ";
		 try
			{
				ps=Transaction.conn.prepareStatement("select role from users where username=? and password=?");
				ps.setString(1, username);
				ps.setInt(2, pass);
				ResultSet role=ps.executeQuery();
				while(role.next())
				{
					s=role.getNString(1);
				}
				
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		 if(s.equalsIgnoreCase("admin"))
		 {
			return true;
		 }
		return false;	
	 }
	
	
	
}
