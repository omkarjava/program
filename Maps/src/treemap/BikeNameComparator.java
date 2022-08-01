package treemap;

import java.util.Comparator;

public class BikeNameComparator implements Comparator<Bike>{
  
	
	public int compare(Bike b1,Bike b2)
	{
		if(b1.brand.equalsIgnoreCase(b2.brand))
			return b1.id-b2.id;
		else
			return b1.brand.compareTo(b2.brand);
	}

	
	
	
	
	
	


	
}
