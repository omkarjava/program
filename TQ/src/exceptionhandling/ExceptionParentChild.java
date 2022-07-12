package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class Ab
{
	void display() throws ArithmeticException
	{
		System.out.println("parent class");
	}
}
class Bc extends Ab
{
	void display()throws LinkageError
	{
		System.out.println("in child");
	}
}






public class ExceptionParentChild {

	public static void main(String[] args) {
    

	}

}
