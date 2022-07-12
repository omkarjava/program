package string;

import java.util.Arrays;

public class Stringjava {

	public static void main(String[] args) {
     
		String s1="     Java     ";     //leterals
		String s2="Language";
		String s3="Java";
		String s4=new String("Java");       //new keyworld
		String s5="java";
		String s6=new String ("Java");
		
		System.out.println(s1+" /"+s1.trim());//before and after spaces
		
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s6));
		System.out.println(s1.equalsIgnoreCase(s5));		
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s5));
		
		System.out.println(s1.compareTo(s2));
		//s1>s5  +ve  ascii(s1)-ascii(s5)
		//s1<s5  -ve  ascii(s1)-ascii(s5)
        //s1==s5 0    ascii(s1)-ascii(s5)
		
		
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println("Length: "+s1.length());
		System.out.println("CharAt: "+s1.charAt(8));
		
		
		System.out.println("index of: "+s2.indexOf('n'));
		System.out.println("LastIndexOf: "+s2.lastIndexOf("ag"));
		
		System.out.println("Start With: "+s2.startsWith("L"));
		System.out.println("Ends With: "+s2.endsWith("e"));
		
		System.out.println("Replace: "+s2.replace("ag", "Ag"));
		System.out.println(s2);
		
		System.out.println("replacing first: "+s2.replaceFirst("L", "la"));
		
		
		System.out.println("substring: "+s2.substring(6));//Language
		System.out.println(s2.substring(4, 7));
		
		System.out.println(s2.isEmpty());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		
		char ch[]=s2.toCharArray();
		System.out.println(Arrays.toString (ch));
		 
		
		String ss="java is programming language";
		String str[]=ss.split(" ");
		System.out.println(Arrays.toString(str));
		
		char[] string1 = s1.toCharArray();  
        char[] string2 = s2.toCharArray();  

        Arrays.sort(string1);  
        Arrays.sort(string2);  
       System.out.println(string1);
	}

}
