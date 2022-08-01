package assignment8;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Username");
	    String Username= sc.next();	
        System.out.println("Password"); 
        String passward= sc.next();	
        char c[]=passward.toCharArray();
        for(int i=0;i<c.length;i++)
        {
        	if(c[i]<=8)
        	{
        		System.out.println("not more than 8 char");
        	}
        	else if( c[i]=='@' || c[i]=='#')
        	{
        		break;
        	}
//        	else
//        	{
//        		System.out.println("Special character is required");
//        	}
        	else if(c[i]>=0 || c[i]<=9)
        	 {
        		 System.out.println("character");
        	 }
        	else if(c[i]==' ')
        	{
        		System.out.println("space not valid");
        	}
        	else if(c[i]>='a'||c[i]>='A')
        	{
        		System.out.println("at list one character");
        	}
        	
        	
        	
        	
        }
        System.out.println(passward);
	}
}
