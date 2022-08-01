package linklistAssignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example2 {

	public static void main(String[] args) {
		 LinkedList <Integer>ll=new LinkedList<>();

		ll.add(12);
		ll.add(22);
		ll.add(122);
		ll.add(10);
		ll.add(129);
		ll.add(1);
		ll.add(21);
		System.out.println(ll); 
		
//		ll.add(2);
//		System.out.println(ll);
//		Iterator it=ll.iterator();
//		 while(it.hasNext())
//		 {
//			 System.out.print(it.next()+" ");
//		 }
		 ListIterator<Integer> it1=ll.listIterator(ll.size());
		 while(it1.hasPrevious())
		 {
			System.out.print(it1.previous()+" ");
		 }
		 
		 
	}

}
