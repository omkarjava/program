package fileinputoutstream_in_java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

	
	void fileRead() 
	{
		try {
			FileReader fr=new FileReader("D:\\test.txt");
			
			BufferedReader br=new BufferedReader(fr);
			String s;
			
			try {
				while((s=br.readLine())!=null)
				{
					System.out.println(s);
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally
//		{
//			br.close();
//		}
		
	}
	
	void writeStream()
	{
		try {
			FileWriter fw=new FileWriter("D://test.txt",true);
			
			fw.write("Class Done");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	
	
	public static void main(String[] args) {
	
		 CharacterStreamExample c= new  CharacterStreamExample();
		 c.fileRead();
		 System.out.println();
		 c.writeStream();
		 System.out.println();
		 c.fileRead();
		
	}

}
