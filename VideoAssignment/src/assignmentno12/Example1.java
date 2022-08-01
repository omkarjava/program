package assignmentno12;

import java.util.ArrayList;
import java.util.HashMap;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<Item>al=new ArrayList<>();
     
		al.add(new Item(12,"parle",20,10));
		al.add(new Item(12,"gooday",40,30));
		al.add(new Item(12,"parle",20,5));
		al.add(new Item(12,"gooday",40,10));
		
		HashMap<String,Integer>hm=new HashMap<>();
		
		for(Item a:al)
		{
			
			if(hm.containsKey(a.name))
			{ 
				hm.put(a.name,hm.get(a.name)+a.qty);
			}
			else
				hm.put(a.name, a.qty);
		}
		
		System.out.println(hm);
	
	}

}
