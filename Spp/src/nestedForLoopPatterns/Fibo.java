package nestedForLoopPatterns;

public class Fibo {

	public static void main(String[] args) 
	{
		int a,b;
		a=0;
		b=1;
		int c;
		
		System.out.print(a);
		
		System.out.print(b);
		while(b<10)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
