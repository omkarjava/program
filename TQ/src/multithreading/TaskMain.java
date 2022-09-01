package multithreading;

public class TaskMain {
public static void main(String[] args) {
	
	Task t1=new Task();
	Task t2 =new Task();
	Task t3=new Task();
	Task t4 =new Task();
	
	t1.start();
	t2.start();

	t3.start();
	t4.start();
	
	t1.setName("Thread 1");
	t2.setName("Thread 2");
	t3.setName("Thread 3");
	t4.setName("Thread 4");
	
	
	t1.setPriority(5);
	t2.setPriority(3);
	t3.setPriority(8);
	t4.setPriority(10);
	
	//t1.start();
//	try {
//		t1.join();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
//	try {
//		t3.join();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
//	
//	System.out.println(t1.getState());
//	t2.setDaemon(true);
//	t1.start();
//	t2.start();
//	System.out.println(t2.getState());
//	
//	System.out.println("Thread 1 "+t1.getPriority());
//	t2.setPriority(10);
//	System.out.println("Thread 2 "+t2.getPriority());
//	
//	System.out.println(t1.isAlive());
//	System.out.println(t2.isDaemon());
//	System.out.println(t1.isInterrupted());
	
	
}
}
