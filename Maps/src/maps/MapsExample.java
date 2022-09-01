package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapsExample {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();//random print
		LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>();//retain order of insertion
		TreeMap<Integer,String>tm=new TreeMap<>();//accending order output
		
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
		hm.put(null,null);
		hm.put(null,null);
		hm.put(5,null);
		System.out.println(hm);
		System.out.println();
		lhm.put(10, "ram");
		lhm.put(12, "sachin");
		lhm.put(11, "gaurav");
		lhm.put(19, "rakesh");
		lhm.put(18, "vaibhav");
		lhm.put(100, "anand");
		lhm.put(98, "Avi");
		lhm.put(102, "jay");
		lhm.put(101, "avanti");
		lhm.put(8, "Avi");
		lhm.put(null,null);
		lhm.put(null,null);
		lhm.put(5,null);
		System.out.println(lhm);
		System.out.println();
		tm.put(5,null);
		//tm.put(null,null);
		tm.put(10, "ram");
		tm.put(12, "sachin");
		tm.put(11, "gaurav");
		tm.put(19, "rakesh");
		tm.put(18, "vaibhav");
		tm.put(100, "anand");
		tm.put(98, "Avi");
		tm.put(102, "jay");
		tm.put(101, "avanti");
		tm.put(8, "Avi");
		System.out.println(tm);
	}

}
