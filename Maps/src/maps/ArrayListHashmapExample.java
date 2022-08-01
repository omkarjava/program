package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ArrayListHashmapExample {

	public static void main(String[] args) {
	ArrayList<Integer>n=new ArrayList<>();

	n.add(100);
	n.add(200);
	n.add(300);
	n.add(400);
	n.add(500);
	n.add(400);
	n.add(300);
	n.add(200);
	n.add(100);
	n.add(100);
	n.add(101);
	n.add(110);
	
	 HashMap<Integer,Integer>hm=new HashMap<>();
	 
	for(Integer i:n)
	{
		if(hm.containsKey(i))
		{
			int v=hm.get(i)+1;
			hm.put(i, v);
		}
		else
			hm.put(i, 1);
	}
	System.out.println(hm);
	
	
	
	}

}
