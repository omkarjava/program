package mock;

public class Substraction {

	public static void main(String[] args) {
		int a=45123678;
		int s=0;
		while(a>0)
		{
			int b=a%10;
			s=s-b;
			a=a/10;
			
		}
		System.out.println(s);
	}

}
