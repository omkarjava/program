    package collection;

    import java.util.PriorityQueue;

    public class Queue {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");
		queue.add("Rahul");
		//queue.add(null);
		System.out.println(queue);
		queue.remove(); 
		System.out.println(queue);
		queue.remove(); 
		System.out.println();
		queue.poll(); 
		System.out.println(queue);
		
		PriorityQueue<Integer> q=new PriorityQueue<>();  
		q.add(5);
		q.add(1);
		q.add(3);
		q.add(4);
		q.add(2);
		
		System.out.println(q);
		
		
		
		
	}

}
