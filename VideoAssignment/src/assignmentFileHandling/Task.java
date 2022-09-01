package assignmentFileHandling;

public class Task extends Thread{
   
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	
	
	
	public static void main(String[] args) {
		Thread t1=new Task();
		//t1.run();
		t1.start();
        t1.setPriority(15);
	}

}
