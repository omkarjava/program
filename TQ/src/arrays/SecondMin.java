package arrays;

import java.util.Arrays;

public class SecondMin {

	public static void main(String[] args) {
		int a[]= {-20,0,-25,15,19,37,23};
		int b=a.length;
		for(int i=0;i<b;i++)
		{
			for(int j=i+1;j<b;j++)
			{
				if(a[i]<a[j])
				{
				int c=a[i];
				a[i]=a[j];
				a[j]=c;
				}
				
			}
		}
		System.out.println("Array:"+Arrays.toString(a));
		System.out.println("min no:"+a[1]);

	}

}
