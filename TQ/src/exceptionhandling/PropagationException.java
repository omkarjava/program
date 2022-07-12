package exceptionhandling;

public class PropagationException {
	
	void method1()
	{
		
		int s=50/0;
	}
	void method2()
	{
		method1();
	}
	void method3()
	{
	 try
	 {
		method2();
	 }
	 catch (ArithmeticException a)
	 {
		System.out.println("Exception Handled");
	 }
	}

	public static void main(String[] args) {
		PropagationException  p=new PropagationException ();
         p.method3();
         System.out.println("Normal flow");
	}

}
