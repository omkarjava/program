package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilereaderWriter {

	public static void main(String[] args) throws IOException {
		FileReader FR=null;
		FileWriter FW=null;
		File f =new File("New Text Document.txt");
      
	try
	{
		FW=new FileWriter (f);
		FW.write("Welcome to Java");
		
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	finally
	{
		System.out.println("Writer close");
		FW.close();
	}
	
	try
	{
		FR=new FileReader (f);
		int i;
		while((i=FR.read())!=-1);
		{
			System.out.println((char)i);
		}
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	
	System.out.println();
	
	System.out.println("Done");
	
	}

}
