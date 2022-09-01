package fileinputoutstream_in_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	
	
	void readFile()
	{
		try {
			FileInputStream fs=new FileInputStream ("D:\\test.txt");
			 int i;
			 try {
				while((i=fs.read())!=-1)
				 {
					 System.out.print((char)i);
				 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void write()
	{
		try {
			FileOutputStream fs=new FileOutputStream("D:\\test.txt",true);
			String s=" orcle batch";
			for(int i=0;i<s.length();i++)
			{
				int c=s.charAt(i);
				try {
					fs.write(c);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	void FileClassExample()
	{
		File f=new File("D:\\test.txt");
		
	}

	public static void main(String[] args) {
		FileHandling f=new FileHandling();
		//f.write();
		System.out.println();
		f.readFile();
        f.FileClassExample();
	} 

}
