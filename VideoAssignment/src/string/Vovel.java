package string;

import java.util.Arrays;

public class Vovel {

	public static void main(String[] args) {
		
		String s= "java is a programming language";
		
		char c[]=s.toCharArray();
		int cnt=0;
		int a[]=new int [12];
		int d=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				cnt++;
				a[d]=c[i];
				d++;
			}
			if(cnt>0)
			{
			System.out.println(a[i]);
			}
		}
	    
	}

}
