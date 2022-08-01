package collection;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListDecending {

	public static void main(String[] args) {
		LinkedList<Integer> al=new LinkedList<>();
		
		 al.add(20);
		 al.add(10);
		 al.add(30);
		 al.add(40);
		 al.add(50);
		 al.add(60);
		 al.add(10);
		  
		 System.out.println(al);
		 Iterator <Integer> itr=al.descendingIterator();
		 while(itr.hasNext())
		 {
			 System.out.print(itr.next()+" ");
		 }

	}

}
