package assignmentFileHandling;

public class Example implements Runnable {
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		Example e=new Example();
		Thread t1=new Thread(e);
		Thread t2=new Thread(e);
		t1.start();
		t2.start();
	

	}

}
