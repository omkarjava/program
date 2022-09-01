package practice;

import java.util.Comparator;

public class Comparator_Car implements Comparator<Car>{


	public int compare(Car a1, Car a2) 
	{
		if(a1.brand.equals(a2.brand))
		{
			 if(a1.price==a2.price)
			{
				if(a1.id>a2.id)
				{
					return 1;
				}
				else
				{
					return -1;
				}
			}
			 else
				 
			 {
				 return 1;
			 }
		}
		
		return a1.brand.compareTo(a2.brand);
		
	}

}
