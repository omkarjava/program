    package example;

import java.util.Arrays;

public class SeparateZeros {

	public static void main(String[] args) {
		int a[]={1,5,0 ,6,0,4};
		for(int i=0;i<a.length;i++)
		{
	     	for(int j=i+1;j<a.length;j++)
		   {
			
			  if(a[i]<a[j])
		    {  
				int c=a[i];
				a[i]=a[j];
				a[j]=c;
		    }	
				
		    }
		}
		System.out.println(Arrays.toString(a));	
			
			
			
		

	}

}
