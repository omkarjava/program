package superchaining;

public class B  extends A{
	int a=1;
	B()
	{
		//super();
		System.out.println("default B");
	}
	B(int a,int b)
	{
		super(4);
		System.out.println(a+b);
	}
	B(int a,int b,int c)
	{
		System.out.println(a+""+b+" "+c);
	}
	void display()
	{
		System.out.println(super.a);
	}

}
