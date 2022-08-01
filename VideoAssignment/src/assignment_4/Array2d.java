package assignment_4;

import java.util.Scanner;

public class Array2d {
	
	void array(int a[][],int r, int c)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
		     System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter no of rows");
         int r=sc.nextInt();
         System.out.println("Enter no of coloumns");
         int c=sc.nextInt();
         
         int a[][]=new int [r][c];
         System.out.println("enter the "+(r*c)+"element");
         for(int i=0;i<r;i++)
         {
         	for(int j=0;j<c;j++)
         	{
         		
         		a[i][j]=sc.nextInt();
         		
         	}
        
         }
         Array2d  b=new Array2d ();
         b.array(a, r, c);
         
	}

}
