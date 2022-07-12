package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling1 {
	static void add(int a,int b)
	{
		System.out.println(" Additon is: "+(a+b));
	}
	static void div(int a,int b)
	{
		//System.out.println(" Division is: "+(a/b));
		try
		{
			System.out.println(" Division is: "+(a/b));
		}
		catch(ArithmeticException c)
		{
			//System.out.println(c);	
			c.printStackTrace();
		}
	}
    
	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Two number");
    int a=sc.nextInt();
    int b=sc.nextInt();
//    try
//    {
//    div(a,b);
//    }
//    catch(ArithmeticException c)
//    {
//    	//System.out.println(c);
//    	c.printStackTrace();
//    }
    div(a,b);
    add(a,b);
    System.out.println("Done");
	}

}
