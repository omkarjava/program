package queue;

import java.util.ArrayDeque;
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
		qe.add(101);
		qe.add(55);
		qe.add(65);
		System.out.println(qe);
		qe.remove();// remove return true or false
		System.out.println(qe);
		
		System.out.println("peak:"+qe.peek());
		System.out.println(qe.element());// head but it will throw exception when queue is empty
		
		System.out.println("poll:"+qe.poll());// remove as well as it will return the element
		System.out.println(qe);
		
		
		System.out.println(qe.size());
		
		ArrayDeque<Integer>d=new ArrayDeque<>();
		d.add(25);
		d.add(65);
		d.add(59);
		d.add(89);
		System.out.println(d);
		d.remove();
		System.out.println(d);
		
		
	}

}
