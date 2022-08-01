package exception;

public class ExceptionPropagation {
	
	void mymethod(int a,int b)
	{
		
		int c=a/b;
		System.out.println("mymethod1");
	}
	void mymethod1()
	{
		 mymethod(5, 5);
		System.out.println("mymethod2");
	}
	
	void mymethod3()
	{
		try
		{
		 mymethod1();
		 System.out.println("mymethod3");
		}
		catch(ArithmeticException a)
		{
		 System.out.println("Not Divisible By Zero");	
		}
		System.out.println("done");
	}
	
	

	public static void main(String[] args) {
		ExceptionPropagation  e=new ExceptionPropagation ();
		e.mymethod3();

	}

}
