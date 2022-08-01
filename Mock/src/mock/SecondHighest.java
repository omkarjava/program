package mock;

import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) {
		int a[]= {4,5,2,3,6,9,79,3};
		int large=0;
		int secondlarge=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				secondlarge=large;
				large=a[i];
			}
			else if(a[i]>secondlarge)
			{
				secondlarge=a[i];
			}
			
		}
		System.out.println(large);
		System.out.println(secondlarge);

	}

}
