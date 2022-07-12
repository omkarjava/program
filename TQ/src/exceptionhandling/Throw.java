package exceptionhandling;

public class Throw {
	int getStringLength(String s) //throws NullPointerException
	{
		if(s==null)
		{
			//System.out.println("null String");
			throw new NullPointerException("String is null");
		}
		return s.length();
	}

}
