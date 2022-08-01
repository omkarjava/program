package treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MainCar {

	public static void main(String[] args) {
		TreeMap<Integer,Car>ct=new TreeMap<>();
		
		ct.put(2,new Car("Nexon","Tata",2010,953000));
		ct.put(3,new Car("Safari","Tata",2008,1053000));
		ct.put(4,new Car("Swift","Maruti",2012,853000));
		ct.put(5,new Car("RangeRover","Tata",2015,4553000));
		ct.put(1,new Car("Innova","Toyota",2015,2053000));
		
		//System.out.println(ct);
		System.out.println("-----Iterator-----");
		Iterator itr=ct.entrySet().iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        System.out.println();

        System.out.println("----Entry Map -----"); 
        
        for(Map.Entry<Integer, Car>entry:ct.entrySet())
        {
        	System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println();
        System.out.println("-----Iterator Using Map.Entry-----");
        Iterator<Map.Entry<Integer, Car>>lmitr=ct.entrySet().iterator();
        while(lmitr.hasNext())
        {
        	Map.Entry<Integer,Car>ent=lmitr.next();
        	System.out.println(ent.getKey()+" "+ent.getValue());
        }
        
        
        
        
	}

}
