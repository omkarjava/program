package assignmentFileHandling;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		File fl=new File("D:\\Directory.txt");
		
		fl.mkdir();
		System.out.println("Directory is Created");
		
		//File f1=new File("D:\\Directory.txt");
		System.out.println(fl.getAbsolutePath());
		
	}

}
