package string;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		String s="RACECAR";
		//String s1="RACECAR";
		char c[]=s.toCharArray();
		//char c1[]=s1.toCharArray();
		//String a=s;
		String reverse="";
		for(int i=c.length-1;i>=0;i--)
		{
			 reverse=reverse+c[i];
					
		}
		System.out.println(reverse);
		System.out.println(s);
		if(s.equals(reverse))
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("np");
		
		
//		for( int i=0;i<c1.length;i++)
//		{
//			 for( int j=i;j<c1.length;j++)
//			  {
//				  char b=c1[i];
//				  c1[i]=c1[j];
//				  c1[j]=b;
//			  }
//		}
//		System.out.println(Arrays.toString(c1));
//        int g=0;
//        if(c.length==c1.length) {
//        	for(int i=0;i<c.length;i++)
//        	{
//        		if(c[i]==c1[i])
//        			g++;
//        		
//        	}
//           if(g>0)
//        	   System.out.println("palindrome");
//           else
//        	   System.out.println("np");
//        }
//        else
//        	System.out.println("np");
		
		
		
		
		
		
		
	}

}
