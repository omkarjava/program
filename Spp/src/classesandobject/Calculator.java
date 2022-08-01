package classesandobject;

public class Calculator {
	void add()
	{
		int a=10,b=20;
		System.out.println("Addition is :"+(a+b));
	}
	void substract()
	{
		int a=20,b=10;
		System.out.println("Substraction is :"+(a-b));
	}
	void multiplication()
	{
		int a=10,b=30;
		System.out.println("Multiplication is :"+(a*b));
	}
	void division()
	{
		int a=5,b=10;
		System.out.println("Division is :"+(a/b));
	}
	
//	void main()
//	{
//		this.add();
//	}

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.add();
		c1.substract();
		c1.multiplication();
        c1.division();
//        Calculator c2=new Calculator();
//        c2.main();
	}

}
