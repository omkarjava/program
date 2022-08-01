package assignmentNo9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Myclass1 {
	void mymethod1()throws IOException
	{
		   this.mymethod2();
		   System.out.println("Method 1");
		   throw new IOException("exception in method1");
	}
	void mymethod2()throws IOException
	{ 
	
			this.mymethod3();	
			System.out.println("Method 2");
	     	throw new IOException("exception in method2");
		
		
	}
	void mymethod3() throws IOException
	{ 
		    File f1=new File("D://Test1.txtsf");
		    FileReader FR=null;
			FileWriter FW=null;
		try
		{
			 FW=new FileWriter (f1);
	    	FW.write("adgagah");
		}
		 catch(IOException e)
	    {
	    	e.printStackTrace();
	    	//System.out.println("File not found Exception");
	    }
	 //  throw new ArithmeticException();
		System.out.println("Method 3");
	}
	public static void main(String[] args) {
		
		Myclass1 e=new Myclass1();
		try
		{
		e.mymethod1();	
		}
		catch(IOException d)
		{
			d.printStackTrace();
		}
		System.out.println("Done");

	}

}
