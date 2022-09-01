package assignment10;

import java.util.Iterator;
import java.util.LinkedList;

public class TransverseLinklist {

	public static void main(String[] args) {
		LinkedList<Integer> em=new LinkedList<>();
		
		em.add(45);
		em.add(5);
		em.add(4);
		em.add(50);
		em.add(35);
		em.add(45);
		em.add(60);
		
		System.out.println(em);
		 Iterator <Integer> itr=em.descendingIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"   ");
		}
		 
	}

}
