package string;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		int a[]= {3,90,45,29,37,78};
		
		for(int i=0;i<a.length/2;i++)
		{
			int s=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=s;
		}
		System.out.println(Arrays.toString(a));
		
		int b[]= {26,0,67,45,0,78,54,34,10,0,34};
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==0)
			{
				b[i]=1;
			}
		}
          System.out.println(Arrays.toString(b));
          
        int c[]= {12,3,-19,29,5,-61,44,7,-9};  //12,3,9,29,5,25,44,7,49
        
        for(int i=0;i<c.length;i++)
        {
        	if(c[i]<0)
        	{
        		c[i]=c[i-1]*c[i-1];
        	}
        }
        System.out.println(Arrays.toString(c));
        
        
        
	}

}
