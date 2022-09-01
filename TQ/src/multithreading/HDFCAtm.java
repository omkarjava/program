package multithreading;

public class HDFCAtm implements Runnable {
	
	BankAccount ob1=new BankAccount ();
 
	public void run()
	{
		System.out.println("depositing amount please wait");
		ob1.transfer(50000);
		System.out.println("transaction Done");
	}
	
	

}
