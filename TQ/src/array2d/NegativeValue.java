package array2d;

import java.util.Arrays;
import java.util.Scanner;



public class NegativeValue {

	public static void main(String[] args) {
		int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Rows And Coloum");
        r=sc.nextInt();
      
        		
       int a[]=new int [r]; 
       
       System.out.println("Enter " +(r)+ " Elements:");
        for(int i=0;i<r;i++)
        {
         a[i]=sc.nextInt();
       
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
        for(int i=0;i<r;i++)
        {
        	if(a[i]<0)
        	{
        		a[i]=a[i-1]*a[i-1];
        	}
        }
        System.out.println(Arrays.toString(a));

     

	}

}
