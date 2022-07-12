package exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionHandling3 {
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
	
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		   int dr[]= {4,5,6,2,3};
		   System.out.println("2 numbers"); 
           int a= sc.nextInt();
           int b= sc.nextInt();
           try 
           {
        	   div(a,b);
        	   array(dr,8);
         	
           }
           catch(ArithmeticException | ArrayIndexOutOfBoundsException c )
           {
         	  System.out.println(c);
           }
//           catch(ArrayIndexOutOfBoundsException c)
//          {
//         	  System.out.println(c);
//          }
           
             
           System.out.println(Arrays.toString(dr));  
             
           
             add(a,b);
             //div(a,b);
            System.out.println("Done"); 
            
            
            
            
            
             
	}

}
