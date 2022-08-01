package mock;

public class AddDigits {

	public static void main(String[] args) {
		int a=142643;
		int b=0;
		while(a>0)
		{
			int s=a%10;
			b=b+s;
			a=a/10;
		}
         System.out.print(b);
	}

}
