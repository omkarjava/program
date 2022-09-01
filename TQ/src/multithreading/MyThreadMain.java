package multithreading;

public class MyThreadMain {
public static void main(String[] args) {
	
	MyThread obj=new MyThread();
	
	Thread t1=new Thread(obj);
	Thread t2=new Thread(obj);
	
	t1.start();
	t2.start();
}
}
