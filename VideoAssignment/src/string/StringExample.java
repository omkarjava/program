package string;

public class StringExample {

	public static void main(java.lang.String[] args) {
		String s ="core";
		String s1="java";
		String s2 ="world";
		char c[]=s.toCharArray();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
			if(i<c1.length)
			System.out.print(c1[i]);
			if(i<c2.length)
				System.out.print(c2[i]);
			
			System.out.println();
		}
		System.out.println();
		String a="core java good";
		String a1[]=a.split(" ");
		for(int i=0;i<a1[0].length();i++)
		{
		  System.out.print(a1[0].charAt(i));	
		  System.out.print(a1[1].charAt(i));	
		  System.out.print(a1[2].charAt(i));	
		  System.out.println();
		}
		
		
	}

}
