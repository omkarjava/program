package practice;

public class Pattern {
public static void main(String[] args) {
	
	
	for(int i=0;i<7;i++)
	{
		int a=0;
		int b=1;
		int c=0;
		for(int j=0;j<i;j++)
		{
			
			System.out.print(a+" ");
//			b=a+b;
			c=a+b;
			a=b;
			b=c;
			
		
		}
		System.out.println();
	}
}
}
