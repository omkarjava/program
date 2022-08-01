package string;

public class Uppercasestring {

	public static void main(String[] args) {
		String s ="java is aprogramming language";
		String s1=" ";
		char c;
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			if(c>=97&&c<=122)
			{
				s1=s1+(char)(c-32);
			}
			else 
				s1=s1+c;
		}
		System.out.println(s1+" ");
		

	}

}
