package mock;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		  int a[]= {4,5,6,3,5};
		 int k=a.length;
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=i+1;j<a.length;j++)
			  {
				if (a[i]>a[j]) 
				{
					int b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
				  
			  }
			  
		  }
		   System.out.println("Sorted Array");
		  System.out.println(Arrays.toString(a));

	}

}
