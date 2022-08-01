package assignment11;

import java.util.ArrayList;
import java.util.HashMap;

public class MainItem {

	public static void main(String[] args) {
		ArrayList<Item>at=new ArrayList<>();

		at.add(new Item (12,"chitale","milk",45628792));
		at.add(new Item (18,"Britania","food",4628792));
		//at.add(new Item (19,"Tata","automobile",45628792));
		at.add(new Item (15,"honda","bikes",40628792));
		at.add(new Item (2,"dell","electronic",4628792));
		//at.add(new Item (11,"parleg","biscuit",45628792));
		at.add(new Item (12,"chitale","milk",45928792));
		at.add(new Item (18,"Britania","food",45828792));
		at.add(new Item (19,"Tata","automobile",4628792));
		at.add(new Item (15,"honda","bikes",4568792));
		at.add(new Item (2,"dell","electronic",4562892));
		at.add(new Item (11,"parleg","biscuit",4528792));
		
		HashMap<String,Integer>ma=new HashMap<>();
//		for(Item s:at)
//		{
//			ma.put(s.company, 1);
//				
//		}
	//	System.out.println(ma);
		
		
		for(Item a:at)
		{
			if(ma.containsKey(a.company))
			{
				
				ma.put(a.company ,ma.get(a.company)+1);
				
			}
			else
				ma.put(a.company, 1);
		}
		System.out.println(ma);
		
	}

}
