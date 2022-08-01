package aaray1;

import java.util.Arrays;

public class ArrayExampleSwipe {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b=0;
		for(int i=0;i<3;i++)
		{
			
		 b=a[i];//1/2/3
		 a[i]=a[i+3];//4//5//6
		 a[i+3]=b;//1//2//3
		}
         System.out.println(Arrays.toString(a));
	}

}
