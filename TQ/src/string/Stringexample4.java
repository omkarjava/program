package string;

import java.util.Arrays;

public class Stringexample4 {

	public static void main(String[] args) {
		String s1="Java is programming language";
		char ch[]=s1.toCharArray();
		int d=ch.length;
		 
		for(int i=d-1;i>=0;i--)                 
		{  
		   System.out.print(ch[i]);
		}  
		  		

	}

}
