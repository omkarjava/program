package aaray1;

import java.util.Arrays;

public class ArrangeArray {

	public static void main(String[] args) {
		int a[]= {2,3,5,4,9,6,7,10,8,6,3};
		
		int b[]=new int [a.length];
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[c]=a[i];
				c++;
			}
			
		}
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]%2!=0)
        	{
        		b[c]=a[i];
        		c++;
        	}
        }
		System.out.println(Arrays.toString(b));
		
		
		
		
		
		
	}

}
