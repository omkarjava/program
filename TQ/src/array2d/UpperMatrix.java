package array2d;

import java.util.Scanner;
public class UpperMatrix {
	

	void UpperTriangle(int a[][],int r,int c)
	{
		  for(int i=0;i<r;i++)                 
		  {                                    
		  	for(int j=0;j<c;j++)               
		   	{                                  
		   		if(j>=i)                       
		   	    System.out.print(a[i][j]);   
		   		else                           
		   		System.out.print(" ");       
		   	}                                  
		   	System.out.println();              
		   }                                   
		                                       
	}
	 void displayarray(int a[][],int r,int c)
	{
	System.out.println("Elements Of Array:");		
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{	
		System.out.print(a[i][j]+" ");
		}
	   System.out.println();
	}
	}

	

	public static void main(String[] args) {
		int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Rows And Coloum");
        r=sc.nextInt();
        c=sc.nextInt();
        		
       int a[][]=new int [r][c]; 		
        System.out.println(" Enter " +(r*c)+ " Elements:");
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{
        		a[i][j]=sc.nextInt();
        	}
        System.out.println();
        }
        UpperMatrix u=new UpperMatrix();
        u.displayarray(a, r, c);
        System.out.println("UpperTriangle");
        u.UpperTriangle(a, r, c);		
//        for(int i=0;i<r;i++)
//        {
//        	for(int j=0;j<c;j++)
//        	{
//        		System.out.println(a[i][j]);
//        	}
//        System.out.println();
//        }
       
        

	}

}
