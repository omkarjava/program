package mock;

public class min {

	public static void main(String[] args) {
		int a=28761382;
		int b=9;
		while(a>0)
		{
			int d=a%10;
			if(b>d)
			{
				b=d;
			}
			a=a/10;
		}
		System.out.print(b);

	}

}
