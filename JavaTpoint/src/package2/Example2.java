package package2;

public class Example2 {

	public static void main(String[] args) {
		int a=0,b=1,c=0,d=0;
   
		for(int i=0;i<20;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
	}

}
