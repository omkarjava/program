package video1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;


public class B2 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(10, "ram");
		hm.put(12, "sachin");
		hm.put(11, "gaurav");
		TreeMap<Bikes,HashMap<Integer,String>> bk=new TreeMap<>();

		bk.put(new Bikes(12,"Bullet ","Royal"),hm);
		bk.put(new Bikes(11,"pulser ","Bajaj"),hm);
		bk.put(new Bikes(1,"R15","Yamaha"),hm);
//		bk.put(new Bikes(5,"ZMR","Hero"),150000);
//		bk.put(new Bikes(9,"Shine","Honda"),110000);
//		bk.put(new Bikes(2,"Bullet ","Royal"),250000);
		//System.out.println(bk);
		
		Iterator itr=bk.entrySet().iterator();
        while(itr.hasNext())
        {
        	
            Iterator itr1=hm.entrySet().iterator();
        	while(itr1.hasNext())
        	{
        		System.out.println(itr1.next());
        	}
        	System.out.println(itr.next());
        }
        
        
        
        

		
     
	}

}
