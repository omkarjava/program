package interfacing;

public class Scicalculator implements Calculator {
	int a,b;
	public void set(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void add()
	{
		int c;
		c=a+b;
		System.out.println("Addition: " +c);
	}
	public void subtract()
	{
		int c;
		c=a-b;
		System.out.println("Substraction: "+c);
	}
	public void multiply()
	{
		int c;
		c=a*b;
		System.out.println("Multiplication: " +c);
	}
	
	public void divide()
	{
		int c;
		c=a/b;
		System.out.println("Dividation: "+c);
	}
	public void power()
	{
		
		System.out.println("Power: "+Math.pow(a, b));
	}
	public void square()
	{
		
		System.out.println("Square : "+Math.pow(a,2));
		
	}
//	public void squareroot()
//	{
//		
//		System.out.println("Square : "+Math.sqrt(a));
//		
//	}

	
		

	}


