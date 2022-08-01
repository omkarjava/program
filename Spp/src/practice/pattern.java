package practice;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int s=sc.nextInt();
		for(int i=1;i<=s;i++)
		{
			for(int j=i;j<=s-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
