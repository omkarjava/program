package string;

public class UpperCase {

	public static void main(String[] args) {
		String s ="Java is A Programming Language";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a'  && c[i]<='z')
			{
				c[i]=(char)( int) (c[i]-32);
			}
			else if(c[i]>='A'  && c[i]<='Z')
			{
				c[i]=(char)(int)(c[i]+32);
			}
		}
		System.out.println(c);
		String s1=String.valueOf(c);
		System.out.println(s1);
		String a="124";
		Integer a1=Integer.valueOf(a);
		System.out.println(a1);
		
	}

}
