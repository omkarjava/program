package linklistAssignment;

import java.util.ArrayList;
import java.util.HashMap;

public class Example5 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
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
		
		ArrayList<Integer>ar=new ArrayList<>();
		for(Integer i:hm.keySet())
		{
			ar.add(i);
		}
		System.out.println(ar);
		ArrayList<String>ar1=new ArrayList<>();
		for(String i:hm.values())
		{
			ar1.add(i);
		}
		System.out.println(ar1);

	}

}
