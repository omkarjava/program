package com.controller;

import java.sql.ResultSet;
import java.util.Scanner;

import com.utility.Getconnection;

public class User {
	
	String username,password,role;

	public User(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", role=" + role + "]";
	}

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		Userimplimentor.conn=Getconnection.getconnections();
//		Userimplimentor uc=new Userimplimentor();
//		
//		char c='y';
//		do 
//		{
//			System.out.println("for set username password role :1\n for change the password :2 \n for Delete Data :3");
//			int a=sc.nextInt();
//			switch(a)
//			{
//			 case 1:
//			   {
//                 System.out.println("enter username password role");
//                 String username=sc.next();
//                 String password=sc.next();
//                 String role=sc.next();
//                 User u=new User(username,password,role);
//                 uc.adduser(u);
//                 
//                 System.out.println("Do want contine y/n");
//				 c=sc.next().charAt(0);
//		         break;
//			   }
//			 case 2:
//			   {
//                 System.out.println("For update password");
//                 System.out.println("Enter username and New Password");
//                 String username=sc.next();
//                 String password=sc.next();
//                 uc.updateuser(username, password);
//                 
//                 System.out.println("Do want contine y/n");
//				 c=sc.next().charAt(0);
//				 break;
//			   }
//			 case 3:
//			 {
//                System.out.println("Enter the Username to Delete");
//                String username=sc.next();
//                uc.deleteuser(username);
//                
//                System.out.println("Do want contine y/n");
//				c=sc.next().charAt(0);
//				break;
//            
//			 }
//	    
//			}
//	    }
//			while(c=='y'||c=='Y');
//		System.out.println("*************************");
}
}
