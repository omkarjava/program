package package1;

public class PalindromeNo {

	public static void main(String[] args) {
		int a=343;
		int b=a;
		int s=0;
		while(a>0)
		{
			int r=a%10;
			s=s*10+r;
			a=a/10;
			
		}
		System.out.println(s);
		if(b==s)
		{
			System.out.println("Palindrome No");
		}
		else
			System.out.println("Not Palindrome");
	}

}
