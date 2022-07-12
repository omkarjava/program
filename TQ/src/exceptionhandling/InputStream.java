package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) {
		 try( FileInputStream fos=new  FileInputStream ("D://Test1.txt"))
		    {
		    	//fos= new FileInputStream ("D://Test1.txt");
		    	int i;
		    	while((i=fos.read())!=-1)
		    	{
		    		System.out.println((char)i);
		    	}
		    	System.out.println();
		    }
		    catch(FileNotFoundException e)
		    {
		    	e.printStackTrace();
		    }
		    catch(IOException e)
		    {
		    	e.printStackTrace();
		    }

	}

}
