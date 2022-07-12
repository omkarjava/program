package string;

import java.util.Arrays;
import java.util.Scanner;

public class WorldCount {

	public static void main(String[] args) {
		String s1="Java is programming language";
		String s[]=s1.split(" ");
		int d=s.length;
		for(int i=0;i<d;i++)                 
		{  
		System.out.print(s[d-(i+1)]+" ");            
		}  
		  		
		System.out.println( " /n " );
		
		char ch[]=s1.toCharArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char");
		char a=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==a)
			{
			 count++;	
			}
		}
		System.out.println("count of given char:"+count);
		
		 
		
		
		
	}

}
