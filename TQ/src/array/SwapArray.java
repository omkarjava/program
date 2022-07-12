package array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {
	
	void swapArray(int a[],int size)
	{
		int b=size/2;
		for(int i=0;i<size/2;i++)
		{
			int s=a[i];
			a[i]=a[b];
			a[b]=s;
			b++;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("enter"+size);
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		SwapArray d=new SwapArray();
		d.swapArray(a, size);

	}

}
