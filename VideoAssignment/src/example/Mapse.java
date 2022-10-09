package example;

import java.util.HashMap;

public class Mapse {

	public static void main(String[] args) {
	   
		HashMap<Integer,String>hm=new HashMap<>();
		
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "a");
		hm.put(4, "c");
		hm.put(5, "a");
		hm.put(7, "b");
		hm.put(6, "a");
		
		HashMap<String,Integer>h=new HashMap<>();
		for(String s:hm.values())
		{
		 	if(h.containsKey(s))
		 	{
		 		int i=h.get(s)+1;
		 		h.put(s, i);
		 	}
		 	else
		 		h.put(s, 1);
		}
		
		System.out.println(h);
		
		

	}

}
