package exception;

public class ExceptionExample {
	
	
	void data(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("hgvuygujygf");
		}
		else
			System.out.println("ok");
	}
	
	

	    public static void main(String[] args) {
		ExceptionExample e=new ExceptionExample();
		try
		{
		e.data(20);
		}
		catch(AgeException a)
		{
			System.out.println("Excepion Handled");
		}
        System.out.println("done");
	}

}
