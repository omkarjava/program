package array;

import java.util.Scanner;

public class ArithmaticProgress {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int b2=sc.nextInt();
	   	int b3=sc.nextInt();
	   	int a=b3-b2;
	   	System.out.println("Enter the index");
	   	int f=sc.nextInt();
	   	int c=b2%a;
		for(int i=c;i<f;i++)
		{
			
			c=c+a;
		}
		 System.out.println(c);		
		

	}

}
