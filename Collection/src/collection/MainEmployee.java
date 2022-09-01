package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class MainEmployee {

	public static void main(String[] args) {
		ArrayList<Employee>e=new ArrayList<>();
		e.add(new Employee(1,"ram","cs",85457));
		e.add(new Employee(2,"ramesh","it",75457));
		e.add(new Employee(3,"rahul","cs",65457));
		e.add(new Employee(4,"rajesh","sales",35457));
		e.add(new Employee(5,"raj","marketing",54507));
		
		HashMap<String,Integer>hm=new HashMap <>();
   
		for(Employee ep:e)
		{
			if(hm.containsKey(ep.dept))
			{
				int c=hm.get(ep);
				hm.put(ep.dept, c+1);
			
			}
			else
				hm.put(ep.dept,1);
		}
		System.out.println(hm);
		
		
	}

}
