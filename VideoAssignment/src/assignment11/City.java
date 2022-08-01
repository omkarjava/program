package assignment11;

import java.util.ArrayList;
import java.util.HashMap;


public class City {

	public static void main(String[] args) {
		ArrayList<String>s=new ArrayList<>();
          s.add("pune");
          s.add("mumbai");
          s.add("pune");
          s.add("mumbai");
          s.add("nashik");
          s.add("pune");
          
          System.out.println(s);
          
          HashMap<String,Integer>st=new HashMap<>();
          
    
         for(String g:s)
         {
         	if(st.containsKey(g))
         	{
         		int v=st.get(g)+1;
         		st.put(g, v);
         	}
         	else
         		st.put(g, 1);
         }
         System.out.println(st);
        
          
	}

}
