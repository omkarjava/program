package arraylistAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Example4 {

	public static void main(String[] args) {
		ArrayList<Character>it=new ArrayList<>();
      
		it.add('d');
		it.add('g');
		it.add('h');
		it.add('d');
		it.add('d');
		it.add('h');
		it.add('g');
		ArrayList<Character>at=new ArrayList<>();
		
		for(int i=0;i<it.size();i++)
		{
			if(!at.contains(it.get(i)))
			{
			 at.add(it.get(i));
			}
		}
		System.out.println(at);
		for(Character c:at)
		{
			System.out.print(c+" ");
		}
		
		
	}

}
