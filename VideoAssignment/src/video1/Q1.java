package video1;

public class Q1 {

	public static void main(String[] args) {
		int a=145;
		int d=0;
		while(a>0)
		{
		 int s=a%10;
		  d=d+s;
		 a=a/10; 
		}
		System.out.println(d);
	}

}
