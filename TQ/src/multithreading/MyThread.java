package multithreading;

public class MyThread implements Runnable{
	
	
	public void run()
	{
		for(int i=5;i!=0;i--)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			
			
		}
	}

}
