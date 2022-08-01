package pattern;

public class Pattern6 {

	public static void main(String[] args) {
		int a=0,b=1;
	for(int i=1;i<=5;i++)
	{
		for(int k=1;k<=5-i;k++)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=i;j++)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
	}

	}

}
