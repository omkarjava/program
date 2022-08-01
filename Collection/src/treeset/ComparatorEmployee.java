package treeset;

import java.util.Comparator;

public class ComparatorEmployee implements Comparator<Employee> 
{

	
	public int compare(Employee a,Employee b)
	{
		if(a.dept.equalsIgnoreCase(b.dept))
			if(a.id>b.id)
  		  		return 1;
  		  	    else if(a.id<b.id)
  		  		return -1;
  		
  		 return a.dept.compareTo(b.dept);
	
  		  	    	
	}
	
	
	
}
