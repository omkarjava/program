package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTraverse {
public static void main(String[] args) {
	
	HashMap<Integer,String> m=new HashMap<>();
	
	m.put(10, "ram");
	m.put(12, "sachin");
	m.put(11, "gaurav");
	m.put(19, "rakesh");
	m.put(18, "vaibhav");
	m.put(100, "anand");
	m.put(98, "Avi");
	
	
	System.out.println("\n key set\n");
	  for(Integer i:m.keySet()) 
      {
      	System.out.println(i);
      }
	  

		System.out.println("\n values\n");
      for(String s:m.values())
      {
      	System.out.println(s);
      }
      

  	System.out.println("\n Entry set\n");
      for(Map.Entry<Integer, String>entry:m.entrySet())
      {
      	System.out.println(entry.getKey()+" "+entry.getValue());
      }
      

  	System.out.println("\n Iterator \n");
      Iterator itr=m.entrySet().iterator();
      while(itr.hasNext())
      {
      	System.out.println(itr.next());
      }
      

  	System.out.println("\n Iterator Map Entry\n");
      Iterator<Map.Entry<Integer, String>>lmitr=m.entrySet().iterator();
      while(lmitr.hasNext())
      {
      	Map.Entry<Integer,String>ent=lmitr.next();
      	System.out.println(ent.getKey()+" "+ent.getValue());
      }
      
      
}
}
