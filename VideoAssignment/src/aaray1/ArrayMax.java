package aaray1;

import java.util.Arrays;

public class ArrayMax {

	public static void main(String[] args) {
		int a[]= {4,5,6,6,5,4,32,6,3};
		int b=5;
		for(int i=0;i<4;i++)
		{
			int d=a[i];
			a[i]=a[b];
			a[b]=d;
			b++;
		}
         System.out.println(Arrays.toString(a));
		
//		int a=28784645;
//		int a1=9;
//		while(a>0)
//		{
//		 int s=a%10;
//		  if(s<a1)
//		  {
//			 a1=s;
//		  }
//		  a=a/10;
//		}
//		System.out.println(a1);
//		
		
	}

}
