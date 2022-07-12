package exceptionhandling;

import java.util.Scanner;

public class Finally {
	static void add(int a,int b)
	{
		System.out.println(" Additon is: "+(a+b));
	}
	static void div(int a,int b)
	{
		System.out.println(" Division is: "+(a/b));

	}
	static void array(int dr[],int i)
	{
		System.out.println(" element at index : "+dr[i]);
	}
	static void str(String s,int j)
	{
		System.out.println(s.charAt(j));
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		   int dr[]= {4,5,6,2,3};
		   System.out.println("2 numbers"); 
		   String s="india";
        int a= sc.nextInt();
        int b= sc.nextInt();
           try
           {
     	   
     		 str("india",2);
     		 array(dr,4);
     	     div(a,b);
     	   }
     	   catch (StringIndexOutOfBoundsException e)
     	   {
     		   System.out.println(e);
     	   }
           
           catch(ArithmeticException e)
           {
     	   System.out.println(e);
           }
           catch(Exception e)
           {
        	   System.out.println(e);
           }
           finally
           {
        	   System.out.println("Finally Always Execute");
           }
		   
           add(a,b);
           System.out.println("Complete");

	}

}
