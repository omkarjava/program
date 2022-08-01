package linklistAssignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example1 {

	public static void main(String[] args) {
		LinkedList<Integer>l=new LinkedList<>();
    
		l.add(12);
		l.add(11);
		l.add(120);
		l.add(123);
		l.add(128);
		l.add(129);
		l.add(18);
		l.add(115);
		l.add(35);
		l.add(40);
	//	System.out.println(l);
//		Iterator<Integer>it=l.descendingIterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next()+" ");
//		}
//		System.out.println();
		ListIterator<Integer>it1=l.listIterator(l.size());
		while(it1.hasPrevious())
		{
			System.out.println(it1.previous());
		}
		
		
		
		
		
		
		
		
	}

}
