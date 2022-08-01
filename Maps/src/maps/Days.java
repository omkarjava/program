package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class Days {

	public static void main(String[] args) {
		ArrayList<String>d=new ArrayList<>();
        d.add("SUNDAY");
        d.add("MONDAY");
        d.add("TUESDAY");
        d.add("SATURDAY");
        d.add("WENSDAY");
        d.add("FRIDAY");
        d.add("THURSDAY");
        d.add("SUNDAY");
        d.add("MONDAY");
        d.add("FRIDAY");
        
        System.out.println(d);
        
        HashMap<String,Integer>da=new HashMap<>();
        
        for(String g:d)
        {
        	if(da.containsKey(g))
        	{
        		int v=da.get(g)+1;
        		da.put(g, v);
        	}
        	else
        		da.put(g, 1);
        }
        System.out.println(da);
        
	}

}
