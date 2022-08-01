package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Car {

	
	
	public static void main(String[] args) throws IOException {

		FileReader FR=null;
		FileWriter FW=null;
		File f =new File("New Text Document.txt");
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
			System.out.println("FileNot Found Exception");
		}
	
	}

}
