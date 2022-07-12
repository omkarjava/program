package constructorChaining;

public class Abc {
	
	Abc()
	{
		System.out.println("default");
	}
	Abc(int a)
	{
		this();
		System.out.println(a);
	}
	Abc(int a,int b)
	{
		this(a);
		System.out.println(a+" "+b);
	}
	Abc(int a,int b,int c)
	{
		this(a,b);
		System.out.println(a+" "+b+" "+c);
	}
	

	public static void main(String[] args) {
		Abc a=new Abc(12,5,4);
		
		

	}

}
