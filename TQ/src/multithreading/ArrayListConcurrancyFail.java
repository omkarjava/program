package multithreading;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcurrancyFail extends Thread {
	
	static ArrayList<String>al;
	
	 ArrayListConcurrancyFail ()
	 {
		 al=new ArrayList<>();
		 al.add("A");
		 al.add("B");
		 al.add("C");
	 }
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		al.add("D");
	}	

	public static void main(String[] args) {

 
		Thread t1=new ArrayListConcurrancyFail();
		t1.start();
		Iterator<String>itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
