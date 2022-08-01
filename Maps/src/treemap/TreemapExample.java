package treemap;

import java.util.TreeMap;

public class TreemapExample {

	public static void main(String[] args) {
		TreeMap<Integer,String>tm=new TreeMap<>();
		
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
		
		System.out.println(tm.descendingMap());
		
		System.out.println(tm.ceilingKey(100));//it will return key which is greater than or equal to 100
		System.out.println(tm.ceilingEntry(100));
 
		System.out.println(tm.floorKey(100));// it will return key less than or equal to 100
		System.out.println(tm.floorEntry(100));
		
		System.out.println(tm.firstEntry());
		System.out.println(tm.firstKey());
		
		System.out.println(tm.tailMap(18));
		System.out.println(tm.tailMap(18, false));
		
		System.out.println(tm.headMap(98));
		System.out.println(tm.headMap(98, true));
		
		System.out.println(tm.subMap(11, 98));
		System.out.println(tm.subMap(11, false, 18, true));
		
		System.out.println(tm.higherEntry(100)); //return strictly greater than 100
		System.out.println(tm.higherKey(100));
		
		System.out.println(tm.lowerEntry(98));//return strictly less than 98
		System.out.println(tm.lowerKey(98));
		
		
		System.out.println(tm.lastKey());
		System.out.println(tm.lastEntry());
		
		
		
	}

}
