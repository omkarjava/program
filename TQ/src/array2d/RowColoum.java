package array2d;

import java.util.Scanner;

public class RowColoum {
//	int r,c;
//	int a[][];
//	
	void row(int a[][],int r,int c)
	{
		System.out.println("Transpose");
		int d[][]=new int[c][r];
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{	
				d[i][j]=a[j][i];
			System.out.print(d[i][j]+" ");
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
        System.out.println("Enter " +(r*c)+ " Elements:");
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{
        		a[i][j]=sc.nextInt();
        	}
       
        }
        RowColoum b=new RowColoum();
        b.displayarray(a, r, c);
		b.row(a,r,c);
		
		

	}

}
