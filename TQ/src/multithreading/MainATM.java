package multithreading;

public class MainATM {

	public static void main(String[] args) {
	 
		 HDFCAtm a=new  HDFCAtm ();
		 Thread t1=new Thread(a);
		 Thread t2=new Thread(a);
		 
		
		t1.start();
		t2.start();
		
		
		
	}

}
