package mock;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {1,5,2,6,3,7,4,8,9,10,11};
		int s=a.length;
		int d=b.length;
		int m=s+d;
		int c[]=new int [m];
		for(int i=0;i<b.length;i++)
		{
			c[i]=b[i];
		}
		for(int j=0;j<a.length;j++)
		{
			c[b.length+j]=a[j];
		}
		System.out.println(Arrays.toString(c));

	}

}
