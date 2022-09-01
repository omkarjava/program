package collection;

import java.util.ArrayDeque;

public class Deque {

	public static void main(String[] args) {
		ArrayDeque<String> deque=new ArrayDeque<String>();  
		    deque.offer("arvind");  
		    deque.offer("vimal");  
		    deque.add("mukul"); 
		    deque.offerFirst("jai");
		    deque.offerLast("jai");
		    deque.addFirst("ka");
		    System.out.println(deque);
		    deque.removeLast();
		    System.out.println(deque);
		    deque.pollFirst();
		    deque.pollLast();
		    System.out.println(deque);
		    
		    System.out.println();
		    
		    ArrayDeque<Integer> q=new ArrayDeque<>(); 
             
		    q.add(5);
			q.add(1);
			q.add(3);
			q.add(4);
			q.add(2);
			q.pop();
			System.out.println(q);
		    
		    
		    
		    
		    
		    
		    
	}

}
