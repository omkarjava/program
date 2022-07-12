package string;

import java.util.Arrays;

public class String17Palindrome {

	public static void main(String[] args) {
		String s="civic";
		char c[]=s.toCharArray();
		int i, j,n=0,m=0;
		for( i=0;i<c.length;i++)
		{
			for( j=i+1;j<c.length;j++)
			{
				char b=c[i];
				c[i]=c[j];
				c[j]=b;
			}
			
		}
		System.out.println(Arrays.toString(c));
		for( i=c.length-1;i>=0;i--)
		{
			for( j=i;j<=0;j++)
			{
				char b=c[i];
				c[i]=c[j];
				c[j]=b;
			}
			
		}
		System.out.println(Arrays.toString(c));
		if(c==c)
		{
		    for(int k=0;k<c.length;k++)
		    {
			
			   if(c==c)
			    {
			
		         System.out.println("Palindrome String");	
		        }
		       else 
			    System.out.println("Not palindrome");
		      }
		}
		else
			System.out.println("Not palindrome");
	}

}
