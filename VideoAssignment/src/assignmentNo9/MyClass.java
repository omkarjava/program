package assignmentNo9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyClass {
	
	void mymethod1()
	{
		this.mymethod2();
		System.out.println("Method 1");
	}
	void mymethod2()
	{
		try 
		{
			this.mymethod3();	
		}
		catch(IOException e)
	    {
	    	e.printStackTrace();
	    }
		
		System.out.println("Method 2");
	}
	void mymethod3() throws IOException
	{ 
		 FileInputStream file=null;
		try
		{
			file= new FileInputStream ("D://Test1.txtsf");
	    	int i;
	    	while((i=file.read())!=-1)
	    	{
	    		System.out.print((char)i);
	    	}
	    	System.out.println();
		}
		 catch(FileNotFoundException e)
	    {
	    	e.printStackTrace();
	    	System.out.println("File not found Exception");
	    }
	 //  throw new ArithmeticException();
		System.out.println("Method 3");
	}
	public static void main(String[] args) {
		MyClass m=new MyClass();
		m.mymethod1();
//		m.mymethod2();
//		try {
//			m.mymethod3();
//		    } 
//		  catch (IOException e) 
//		    {
//			 
//			   e.printStackTrace();
//		     }
	}
}
