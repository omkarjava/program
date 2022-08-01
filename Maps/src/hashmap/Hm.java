package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class Hm {

	public static void main(String[] args) {
		ArrayList<Order>od=new ArrayList<>();
		od.add(new Order(12,"pune",15,"pending"));
		od.add(new Order(16,"mumbai",14,"delivered"));
		od.add(new Order(11,"satara",16,"pending"));
		od.add(new Order(10,"sangli",50,"pending"));
		od.add(new Order(19,"solapur",40,"delivered"));
		od.add(new Order(17,"kolhapur",60,"pending"));
		od.add(new Order(22,"pune",15,"pending"));
		od.add(new Order(23,"mumbai",14,"delivered"));
		od.add(new Order(52,"satara",16,"pending"));
		od.add(new Order(78,"sangli",50,"pending"));
		od.add(new Order(59,"solapur",40,"delivered"));
		od.add(new Order(60,"kolhapur",60,"pending"));
		od.add(new Order(52,"satara",16,"deliver"));
		
	
//		HashMap<String,Integer>st=new HashMap<>();
//		for(Order a:od)
//		{
//			
//				st.put(a.city, a.status);
//		}
//        System.out.println(st);
		HashMap<String,Integer>st=new HashMap<>();
		for(Order a:od)
		{
			if(st.containsKey(a.city))
			{
				if(a.status.equalsIgnoreCase("pending"))
				{
					int s=st.get(a.city)+1;
					st.put(a.city,s);
				}
				
			}
			else
			{
				st.put(a.city,1);
			}
				
		}
		System.out.println(od);
        System.out.println(st);
        
        
        
        
        
        
        
        
	}

}
