package mock;

public class reverse {

	public static void main(String[] args) {
		int a=4512789;
		while(a>0)
		{
			int s=a%10;  
			a=a/10;
			System.out.print(s);
		}
	

	}

}
