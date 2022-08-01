package program;

public class CharReverse {

	public static void main(String[] args) {
		String a="omkar";
		int b=a.length();
		String s="";
		for(int i=b-1;i>=0;i--)
		{
			s=s+a.charAt(i);
		}
		System.out.println(s);
	}

}
