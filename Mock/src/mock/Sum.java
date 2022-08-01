package mock;

public class Sum {

	public static void main(String[] args) {
		int a=14526;
		int sum=0;
		while(a>0)
		{
			int s=a%10;
			sum=sum+s; 
			a=a/10;
		}
		System.out.println(sum);
	}

}
