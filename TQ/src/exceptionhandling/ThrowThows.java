package exceptionhandling;

public class ThrowThows extends Throw {
	int getStringLength(String s) throws NullPointerException
	{
		if(s==null)
		{
		
			throw new NullPointerException("String is null");
		}
		return s.length();
	}
	

	public static void main(String[] args) {
	  
		ThrowThows t1= new ThrowThows ();
		System.out.println(t1.getStringLength("india"));
		try
		{
			System.out.println(t1.getStringLength(null));	
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			 //throw new NullPointerException("String is null");
		}
		
		System.out.println(t1.getStringLength("Mumbai"));
		System.out.println(t1.getStringLength("Program"));
	}

}
