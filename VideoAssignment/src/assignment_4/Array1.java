package assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(StringExample[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Arrays size");
		int a=sc.nextInt();
		System.out.println("Enter Element");
		int a1[]=new int [a];
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
        System.out.println(Arrays.toString(a1));
        int a3[]=new int [a1.length];
        for(int i=0;i<a1.length;i++)
		{
        	a3[i]=a1[i];
        		
			
			
		}
        for(int j=a3.length-1;j>0;j--)
        {
        	System.out.print(a3[j]+" ");
        }
       // System.out.println(Arrays.toString(a3));
//        for(int i=0;i<a1.length;i++)
//		{
//            for(int j=i+1;j<a1.length;j++)
//            {
//            	if(a3[i]<a3[j])
//            	{
//            		int b=a3[i];
//            		a3[i]=a3[j];
//            		a3[j]=b;
//            	}
//            }				
//		}
       // System.out.println(Arrays.toString(a3));
        
	}

}
