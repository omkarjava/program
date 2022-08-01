package overloading;

public class Int {
	Int (){}
	void maxint (int a,int b)
	{
		if(a>b)
		System.out.println(a);
		else
		System.out.println(b);	
	
	}
	void maxchar (char a,char b)
	{
		if(a>=b)
		System.out.println(a);
		else
			System.out.println(b);
	}

	public static void main(String[] args) {
	  Int i=new Int();
	  i.maxint(5, 8);
	  i.maxchar('j','k');

	}

}
