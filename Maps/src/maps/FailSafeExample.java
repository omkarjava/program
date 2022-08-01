package maps;


import java.util.Enumeration;

import java.util.Hashtable;


public class FailSafeExample {

	public static void main(String[] args) {
		
		
		Hashtable<Integer,String>hm= new Hashtable<>();
        hm.put(1, "ram");
        hm.put(8, "neha");
        hm.put(7, "pranjal");
        hm.put(6, "rahul");
        hm.put(5, "sachin");
        hm.put(3, "raj");
        hm.put(4, "ramesh"); 
        hm.put(2, "rakesh");
        
        System.out.println(hm);
		Enumeration e=hm.keys();
		while(e.hasMoreElements())
		{
			if(e.nextElement().equals(5))
				hm.put(100, "sayali");
		}
		System.out.println(hm);
	}

}
