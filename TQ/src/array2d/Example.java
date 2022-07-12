package array2d;

import java.util.Scanner;

public class Example {
int r,c;
int a[][];
void addelements(int a[][],int r,int c)
{
	//int sum=0;
	for(int i=0;i<r;i++)
	{
		int sum=0;
	 for(int j=0;j<c;j++)
	    {
		sum=sum+a[i][j];
	    }
		System.out.println("Addition of Element:"+sum);
	}
}
void multiplication(int a[][],int r,int c)
{
	//int mul=1;
	for(int i=0;i<r;i++)
	{
		int mul=1;
	 for(int j=0;j<c;j++)
	    {
		mul=mul*a[i][j];
	    }
		System.out.println("Multiplication of Element:"+mul);
		}
	
 }
// void substraction(int a[][],int r,int c)
// {
//	// int sub=0;
//		for(int i=0;i<r;i++)
//		{
//			 int sub=0;
//		 for(int j=0;j<c;j++)
//		    {
//			sub=a[i][j]-sub;
//		    }
//			System.out.println("Substraction of Element:"+sub);
//			}
//	 
//	 
// }
// void division(int a[][],int r,int c)
// {
//	// int div=0;
//		for(int i=0;i<r;i++)
//		{
//			int div=0;
//		 for(int j=0;j<c;j++)
//		    {
//			div=a[i][j]-div;
//		    }
//			System.out.println("Division of Element:"+div);
//			}
//	 
//	 
// }
 
	
	void displayarray(int a[][],int r,int c)
	{
	System.out.println("Elements Of Array:");	
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{	
		System.out.print(a[i][j]);
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
        Example a1=new Example();
        a1.displayarray(a,r,c);
        a1.addelements(a, r, c);
        a1.multiplication(a, r, c);		
        //a1.division(a, r, c);		
       // a1.substraction(a, r, c);		
        		
        		
	}

}
