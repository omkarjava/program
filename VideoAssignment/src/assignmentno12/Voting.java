package assignmentno12;

import java.util.HashMap;

public class Voting {

	public static void main(String[] args) {
		HashMap<String,String>hm=new HashMap<>();
		hm.put("79799659565", "shiv-sena");
		hm.put("78499859854", "sena");
		hm.put("45988996595", "manase");
		hm.put("98965955645", "ncp");
		hm.put("77878465955", "manase");
		hm.put("69659589819", "bjp");
		hm.put("49145965958", "manase");
		hm.put("72945756595", "shinde-sena");
		hm.put("94785659598", "shinde-sena");
		hm.put("50799659587", "shiv-sena");
		
		
		
		HashMap<String,Integer>hm1=new HashMap<>();
		for( String s:hm.values())
		{
			if(hm1.containsKey(s))
			{
				hm1.put(s, hm1.get(s)+1);
			}
			else
				hm1.put(s,1);
		}
       System.out.println(hm1);
		
		
		
		
	}

}
