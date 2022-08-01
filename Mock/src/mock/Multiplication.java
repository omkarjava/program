package mock;

public class Multiplication {

	public static void main(String[] args) {
		int a=24513;
		int p=1;
		while(a>0)
		{
			int s=a%10;
			p=p*s;
			a=a/10;
		  
		}
		 System.out.println(p);
	}

}
