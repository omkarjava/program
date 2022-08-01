package queue;

import java.util.PriorityQueue;

public class Example {

	public static void main(String[] args) {
		PriorityQueue<Integer>qe=new PriorityQueue<>();
       // Queue<Integer>q=new PriorityQueue<>();
		
		qe.add(100);
		qe.add(200);
		qe.add(700);
		qe.add(180);
		qe.add(110);
		qe.add(111);
		qe.add(10);
		
		System.out.println(qe);
		qe.remove();// remove return true or false
		System.out.println(qe);
		
		System.out.println("peak:"+qe.peek());
		System.out.println(qe.element());// head but it will throw exception when queue is empty
		
		System.out.println("poll:"+qe.poll());// remove as well as it will return the element
		System.out.println(qe);
		
		
		System.out.println(qe.size());
		
	}

}
