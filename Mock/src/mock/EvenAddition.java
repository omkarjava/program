package mock;

public class EvenAddition {

	public static void main(String[] args) {
		int a=234567891;
		  int b=0;
		while(a>0)
		{
			int s=a%10;
			if(s%2==0)
			{
			 b=b+s;
			}
			a=a/10;
		}
		System.out.print(b);
         
	}

}
