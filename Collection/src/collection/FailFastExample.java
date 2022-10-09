package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class FailFastExample {

	public static void main(String[] args) {
		  ArrayList<Integer> al=new ArrayList<>();
			
			al.add(5);
			al.add(4);
			al.add(3);
			al.add(2);
			al.add(3);
			al.add(2);
			al.add(5);
			al.add(6);
			al.add(4);
			System.out.println(al);
			
//			for(int i=0;i<al.size();i++)
//			{
//				if(al.get(i)==5)
//				{
//					al.add(20);
//				}
//			}
//			System.out.println(al);
			//fail fast iterator IT GIVES concurrentmodification Exception
//			for( Integer i:al)
//		
//			{
//				if(i==5)
//				al.add(20);
//			}
//			System.out.println(al);
			
			
			//
			 ListIterator<Integer> alt=al.listIterator();
			 
			while(alt.hasNext())
			{
				if(alt.next()==2)
				alt.remove();  //listIterator
			}
			System.out.println(al);
			
	}

}
