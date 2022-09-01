package multithreading;

public class BankAccount {
	
	
	int balance =5000;
//	public synchronized void transfer(int amt)
//	{
//		System.out.println("please wait");
//		balance+=amt;
//		System.out.println("balance is:"+balance);
//	}
   
//	void transfer(int amt)
//	{
//		
//		System.out.println("please wait");
//		synchronized(this) 
//		{
//			balance+=amt;
//			System.out.println("balance is:"+balance);	
//		}
//		
//	}
	void transfer(int amt)
	{
		
		System.out.println("please wait");
		synchronized(HDFCAtm.class) 
		{
			balance+=amt;
			System.out.println("balance is:"+balance);	
		}
		
	}
	
}
