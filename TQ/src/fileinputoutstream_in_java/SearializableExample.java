package fileinputoutstream_in_java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SearializableExample {

	
	void storeObject()
	{
		try 
		{
			FileOutputStream fos=new FileOutputStream("D:object.txt");
			try {
				ObjectOutputStream oos=new 	ObjectOutputStream(fos);
				
				Employee s=new Employee(101,"sham","it",8522); 
				oos.writeObject(s);
				
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fos.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void readObjectData()
	{
		FileInputStream fis;
		try {
			fis=new FileInputStream("D://object.txt");
			try {
				ObjectInputStream os=new ObjectInputStream(fis);
				
				try {
					int a=5;
					while(a!=0)
					{
					Employee e=(Employee)os.readObject();
					
					System.out.println(e);
					a--;
					}
				} 
				catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	void array()
	{
		try 
		{
			FileOutputStream fos=new FileOutputStream("D:object.txt", true);
			try {
				ObjectOutputStream oos=new 	ObjectOutputStream(fos);
				
				ArrayList<Employee> e=new ArrayList<>();
				e.add(new Employee(101,"sham","it",8522));
				e.add(new Employee(102,"ram","entc",8523));
				e.add(new Employee(103,"vishal","electrical",8524));
				e.add(new Employee(104,"shamal","civil",8525));
				e.add(new Employee(105,"babu","mech",8526));
				//oos.writeObject(e);
				for(int i=0;i<e.size();i++)
				{
					oos.writeObject(e.get(i));
				}
				
			} 
			
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fos.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {

		 SearializableExample s=new  SearializableExample();
		// s.storeObject();
		 s.array();
		 s.readObjectData();
	}

}
