package assignment8;

import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {
		String s="java is a programming language ";
		String st[]=s.split(" ");
        
		for(int i=0;i<st.length;i++)
		{
			if(st[i]=="programming")
			{
				st[i]=" ";
			}
		}
		System.out.println(Arrays.toString(st));
		
	}

}
