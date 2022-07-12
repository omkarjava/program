package array2d;

import java.util.Scanner;

public class ScalarMultiplication {
	
	
	 void minor(int a[][],int r,int c)
	 { 
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
				{
					System.out.print(a[i][j]);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	 }
	  void Display(int a[][],int r,int c )
	  {
	     for(int i=0;i<r;i++)
		 {
			for(int j=0;j<c;j++)
			{
				
			System.out.print(" "+a[i][j]);
				
			}
			System.out.println();
		 }
	  
	  }
	

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter The No of rows and coloum");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]= new int [r][c];
		System.out.println("Enter the elements");
		for(int i=1;i<r;i++)
		{
			for(int j=1;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		  
		}
		ScalarMultiplication s=new ScalarMultiplication();
		s.Display(a, r, c);
		
		s.minor(a, r, c);
    
	}

}
