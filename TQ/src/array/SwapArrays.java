package array;

import java.util.Arrays;

public class SwapArrays {

	public static void main(String[] args) {
		int a[]= {4,5,6,1,2,3,7,8,9};
		for(int i=0;i<=4;i++)
		{
			int j;
			int v=a[0];
			for( j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[j]=v;
		}
		System.out.println(Arrays.toString(a));

	}

}
