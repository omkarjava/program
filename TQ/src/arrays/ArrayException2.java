package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayException2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		   System.out.println("element");
        int a= sc.nextInt();
        int b[]= {4,5,6,2,3};
     
      try 
      {
    	  System.out.println(b[a]);
      }
      catch(Exception c)
      {
    	  System.out.println(c);
      }
        
      System.out.println(Arrays.toString(b));  
        
       System.out.println("Done"); 
        
        
	}

}
