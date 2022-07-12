package string;

import java.util.Arrays;

public class Stringexample2 {

	public static void main(String[] args) {
		String s="java";
		String s1=new String ("java");
		String s2="Language";
		System.out.println(s);
        
		 System.out.println(s.compareTo(s1));
		 System.out.println(s.length());
		 System.out.println(s1.concat(s2));
		 System.out.println(s.toLowerCase());
		 System.out.println(s2.toUpperCase());
		 
		// String s3=s2.string();
		 String s4="Hello@world";
		 String a[]=s4.split("@");
		 System.out.println(Arrays.toString(a));
		 
		 System.out.println(s.replaceAll("a", s));
	}

}
