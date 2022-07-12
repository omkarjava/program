package array;

import java.util.Arrays;

public class SecondHighNo {

	public static void main(String[] args) {
		int a[]= {8,6,9,4,5,25,82,3};
		int large=0;
		int secondlarge=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				secondlarge=large;
				large=a[i];
			}
			else if (a[i]>secondlarge)
			{
				secondlarge=a[i];
			}
		}
//		System.out.println("Sorted Array");
//		System.out.println(Arrays.toString(a));
//       System.out.println("second large no is:"+secondlarge);
		System.out.println(secondlarge);
	    }
		
       
}
