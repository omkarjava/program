package bank;

import java.util.HashMap;

import java.util.Scanner;

public class Login {
     String username;
     String password;
     int balance;
//     Login(String username,String password)
//     {
//    	 this.username=username;
//    	 this.password=password;
//     }
    
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public int getbalance() 
	{
		return balance;
	}
	public void setbalance(int balance) 
	{
		this.balance = balance;
	}
	 public String toString()
     {
    	 return username+" "+password+" "+balance;
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter The Username");
       String usernane= sc.next();
       System.out.println("Enter The Password");
       String password=sc.next();
       HashMap<String,String>hm=new HashMap<>();
	   hm.put( password,usernane);
		
		
		
	}

}
