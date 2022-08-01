    package mock;

    public class OddAddition {

	public static void main(String[] args) {
		int a=21457863;
		int b=0;
		while(a>0)
		{
			int d=a%10;
			if(d%2!=0)
			{
			  b=b+d;
			}
		    a=a/10;
		    
		}
		System.out.print(b);

	}

}
