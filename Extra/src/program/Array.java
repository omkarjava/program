package program;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int a[]= {4,5,6,7,8,1,23,5};
		int c=a.length;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length/2;j++)
			{
				int b=a[i];
				a[i]=a[j-i-c];
				a[j-i-c]=b;
			}
		}
        System.out.println(Arrays.toString(a));
	}

}
