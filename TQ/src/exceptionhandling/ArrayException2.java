package exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayException2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
         
          System.out.println("size of array");
          int size=sc.nextInt();
          int a[]= new int[size];
          System.out.println("element");
          for(int i=0;i<a.length;i++)
          {
        	  a[i]=sc.nextInt();
        	  try 
              {
            	 System.out.println(a[i]>size); 
              }
        	  catch(Exception  e)
        	  {
        		  System.out.println(e);
        	  }
          }
          System.out.println(Arrays.toString(a));
          
	}

}
