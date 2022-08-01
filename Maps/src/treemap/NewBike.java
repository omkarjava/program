package treemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class NewBike {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(10, "ram");
		hm.put(12, "sachin");
		hm.put(11, "gaurav");
		HashMap<Integer,String>hm1=new HashMap<>();
		hm1.put(19, "rakesh");
		hm1.put(18, "vaibhav");
		hm1.put(100, "anand");
		TreeMap<Integer,HashMap<Integer,String>> bt=new TreeMap<>();
		
		bt.put(2, hm);
		bt.put(1, hm1);
		
		System.out.println(bt);
		
		for(Map.Entry<Integer,HashMap<Integer,String>>ent:bt.entrySet())
		{
			System.out.println(ent.getKey());
			for(Map.Entry<Integer,String>hent:ent.getValue().entrySet())
			{
				System.out.println(hent.getKey()+" "+hent.getValue());
			}
		}
		Iterator itr=bt.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			Iterator itr1=hm.entrySet().iterator();
			while(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}
			
		  
		}
		
		
		
		
		
		
	}

}
