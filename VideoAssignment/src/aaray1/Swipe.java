package aaray1;

import java.util.Arrays;

public class Swipe {

	public static void main(String[] args) {
		int a[]= {4,5,2,6,3,7,8,9};
		
		
		for(int i=0;i<7;i++)
		{
			int b=a[i];
			a[i]=a[i+1];
			a[i+1]=b;
		}
       System.out.println(Arrays.toString(a));
       
//       for(int i=0;i<1;i++)
//		{
//    	   int j,c=a[0];
//    	   for( j=0;j<7;j++)
//    	   {
//			 a[j]=a[j+1];
//    	   }
//    	   a[j]=c;
//		}
//      System.out.println(Arrays.toString(a));
//      
       
       
       
       
       
	}

}
