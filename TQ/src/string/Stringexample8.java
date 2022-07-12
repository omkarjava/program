package string;

import java.util.Arrays;

public class Stringexample8 {

	public static void main(String[] args) {
		String s="Robert Brett Roser";
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			if(i==0 || i==7 )
			{
				System.out.print(c[i]+".");
				
			}
			else if(i>=13&&i<=17)
			{
				System.out.print(c[i]);
			}
			
			
		}
		
	}

}
