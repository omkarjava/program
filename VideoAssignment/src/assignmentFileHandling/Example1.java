package assignmentFileHandling;

public class Example1 implements Runnable {
	
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
		Example1 e1=new Example1();
		Thread t1=new Thread(e1);
		Thread t2=new Thread(e1);
		t1.setName("A");
		t2.setName("C");
		t1.start();
		t2.start();
		
		

	}

}
