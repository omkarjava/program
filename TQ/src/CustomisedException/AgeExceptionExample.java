package CustomisedException;

public class AgeExceptionExample {
	
	void validate(int age) throws AgeException
	{
		if(age<18)
		{
			throw new AgeException("Age is less rhan 18 not allowed for ride");
		}
		else if(age>60)
		{
			throw new AgeException("Age is greater than 60 not allowed for ride");
		}
		else
		{
			System.out.println("Enjoy your ride");
		}
	}
	

	public static void main(String[] args) {
		int age=61;
		AgeExceptionExample ae= new AgeExceptionExample();
		try
		{
			ae.validate(age);
		}
		catch(AgeException e)
		{
			e.printStackTrace();
		}
		System.out.println("Done");

	}

}
