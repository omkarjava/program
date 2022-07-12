package array2d;

import java.util.Arrays;

import array.Array;

public class minmax {

	public static void main(String[] args) {
		int a[]= {1,-2,3,-4,5,-6,7,8};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
			a[i]=a[i-1]*a[i-1];
			}
			
		}
       System.out.println(Arrays.toString(a));
	}

}
