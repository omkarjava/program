package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

public class FailFast {

	public static void main(String[] args) {
		ArrayList<Integer>hm= new ArrayList<>();
        hm.add(1);
        hm.add(8);
        hm.add(7);
        
        System.out.println(hm);
        
        ListIterator <Integer>itr=hm.listIterator();
        while(itr.hasNext())
        {
        	if(itr.next().equals(7))
        		itr.add(20);
     		
        }
        System.out.println(hm);
        
        
	}

}
