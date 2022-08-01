package linklistAssignment;

import java.util.HashMap;

import java.util.Map.Entry;

public class Example4 {

	public static void main(String[] args) {
		HashMap<Integer,Character>hm=new HashMap<>();

		hm.put(1, 'a');
		hm.put(2, 'b');
		hm.put(3, 'c');
		hm.put(4, 'b');
		hm.put(5, 'a');
		hm.put(6, 'a');
		
		HashMap<Character,Integer>hm1=new HashMap<>();
		
		for(Character c:hm.values())
		{
			if(hm1.containsKey(c))
			{
				hm1.put( c,hm1.get(c)+1);
			}
			else
				hm1.put( c,1);
		}
		System.out.println(hm1);
		HashMap<Integer,Character>hm3=new HashMap<>();

		hm3.put(1, 'a');
		hm3.put(2, 'b');
		hm3.put(5, 'c');
		hm3.put(2, 'b');
		hm3.put(1, 'a');
		hm3.put(1, 'a');
		
		HashMap<Integer,Character>hm2=new HashMap<>();
		for(Entry<Integer,Character>a:hm3.entrySet())
		{
			hm2.putIfAbsent(a.getKey(),a.getValue());
		}
		System.out.println(hm2);
		
		
		
		
		
	}

}
