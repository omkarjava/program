    package assignment11;

import java.util.HashMap;
import java.util.LinkedList;

import string.StringExample;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> al=new LinkedList<>();
		
		 al.add(1);
		 al.add(4);
		 al.add(2);
		 al.add(1);
		 al.add(3);
		 al.add(1);
		 al.add(4);
		 LinkedList<String> al1=new LinkedList<>();  
		for(int i=0;i<al.size();i++)
		{
			switch(al.get(i))
			{
			case 1:
				al1.add("one");
				break;
			case 2:
				al1.add("two");
				break;
			case 3:
				al1.add("three");
				break;
			case 4:
				al1.add("four");
				break;
			}
		}
		System.out.println(al1);
		HashMap<String,Integer>st=new HashMap<>();
		for(String s:al1)
		{
			if(st.containsKey(s))
			{
				int a=st.get(s)+1;
				st.put(s, a);
			}
			else
				st.put(s, 1);
		}
		System.out.println(st);
		
		
	}

}
