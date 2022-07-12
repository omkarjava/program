package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;

public class FileinputoutputStream {

	public static void main(String[] args)throws IOException {
	    FileInputStream fos=null;
	    FileOutputStream fis=null;
	    
	    try
	    {
	    	fos= new FileInputStream ("D://Test1.txt");
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
	    finally
	    {
	    	System.out.println("Output Stream Close");
	    	fos.close();
	    }
 
	}

}
