    package accessspecifiers;

    public class Test1 {
	int a=50;
	private int b=12;
	protected int c=45;
	public int d=6;
	void Display()
	{
    System.out.println( a+ b+c+ d);
	}

	public static void main(String[] args) {
		Test1 T1=new Test1();
		System.out.println(T1.a);
		System.out.println(T1.b);
		System.out.println(T1.c);
		System.out.println(T1.d);
		T1.Display();

	}

}
