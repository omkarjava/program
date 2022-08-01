package aaray1;

import java.util.Arrays;

public class UniqueElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,9,1,2,3,5,4};
		//int b=0;
	
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
					
				}
				
			}
			if(c==1)
			{
				System.out.println(a[i]);
			}
		}
       
		
	}

}
