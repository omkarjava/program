package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class Methods {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();//random print
//		LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();//retain order of insertion
//		TreeMap<Integer,String>tm=new TreeMap<>();//accending order output
		
		hm.put(10, "ram");
		hm.put(12, "sachin");
		hm.put(11, "gaurav");
		hm.put(19, "rakesh");
		hm.put(18, "vaibhav");
		hm.put(100, "anand");
		hm.put(98, "Avi");
		hm.put(102, "jay");
		hm.put(101, "avanti");
		hm.put(8, "Avi");
		System.out.println(hm);
		
		System.out.println(hm.isEmpty());
		System.out.println(hm.get(100));//value of the key
		System.out.println(hm.containsKey(8));
        System.out.println(hm.containsValue("Avi"));
        
        System.out.println(hm.hashCode());
        
//        hm.remove(100);
//        System.out.println(hm);
//        hm.clear();
//        System.out.println(hm);
        
        System.out.println(hm.size());
        System.out.println(hm.replace(100,"rahul"));
        System.out.println(hm);
        hm.replace(101, "jjkij");
        System.out.println(hm);
        hm.put(18, "ddgg");
        HashMap<Integer,String>hm1=new HashMap<>();
        
        hm1.put(1000,"vxfb");
        hm1.put(2000, "uhuj");
        hm1.put(3000, "gbyygu");
        
        hm.putAll(hm1);
        System.out.println(hm);
        
       // Transversing Map :
        
        for(Integer i:hm.keySet()) //gives only keys
        {
        	System.out.println(i);
        }
        for(String s:hm.values()) //gives only values of map
        {
        	System.out.println(s);
        }
        
       System.out.println("----Entry Map -----"); 
       
        for(Map.Entry<Integer, String>entry:hm.entrySet())
        {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
        
        System.out.println();
        System.out.println("-----Iterator-----");
//        Set s=hm.entrySet();
//        Iterator
//        
        
        Iterator itr=hm.entrySet().iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        System.out.println();
        
        
        System.out.println("-----Iterator Using Map.Entry-----");
        Iterator<Map.Entry<Integer, String>>lmitr=hm.entrySet().iterator();
        while(lmitr.hasNext())
        {
        	Map.Entry<Integer,String>ent=lmitr.next();
        	System.out.println(ent.getKey()+" "+ent.getValue());
        }
        
        
        
        
        
        
	}

}
