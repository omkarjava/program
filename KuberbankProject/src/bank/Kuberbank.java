package bank;

import java.util.Scanner;

public class Kuberbank {

	public static void main(String[] args) {
//		Kuberbank kb=new Kuberbank();
		Scanner sc=new Scanner(System.in);
		 
		Account.conn=Bankdbconnection.getconnection();
		Account ac=new Account();
		char c='y';
		do 
		{
			System.out.println("for create account :1\n check balance 2:\n deposit money 3");
			int a=sc.nextInt();
			switch(a)
			{
			 case 1:
			   {
				System.out.println("Enter the name addres amount");
				int accno=ac.accountNumber()+1;
				String name=sc.next();
				String address=sc.next();
				int balance=sc.nextInt();
				ac.createAccount(accno, name, address, balance);
				System.out.println("Create user name and password");
				System.out.println("Enter user name and password");
				String Username=sc.next();
				String password=sc.next();
				ac.user(accno, Username, password);
				System.out.println("Do want contine y/n");
				c=sc.next().charAt(0);
				break;
               }
			 case 2:
			 {
				 System.out.println("Enter username password");
				 String username=sc.next();
				 String password=sc.next();
				 int f=ac.checkpassword(username, password);
				 if(f!=0)
				 {
					 ac.checkBalance(f);
				 }
				 else
				 {
					 System.out.println("User name password wrong");
				 }
				 System.out.println("Do want contine y/n");
					c=sc.next().charAt(0);
					break;
			 }
			 case 3:
			 {
				 System.out.println("Username Password");
				 String username=sc.next();
				 String password=sc.next();
				 int f=ac.checkpassword(username, password);
				 if(f!=0)
				 {
					 System.out.println("Enter Amount which is transfer and accno payee ");
					 int amount=sc.nextInt();
					 int accno=sc.nextInt();
					 ac.Deposit(accno, amount);
				 }
				 else
				 {
					 System.out.println("User name password wrong");
				 }
				    System.out.println("Do want contine y/n");
					c=sc.next().charAt(0);
					break;
				 
			 }
			 }
			}
			while(c=='y'||c=='Y');
	}}
		
			
		
		
		

	


