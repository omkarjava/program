package maps;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashmap {

	public static void main(String[] args) {
		HashMap<Integer,Employee>sa=new HashMap<>();
		
		sa.put(101, new Employee("ram","hr",53000));
		sa.put(108, new Employee("raj","sales",90000));
		sa.put(103, new Employee("rahul","marketing",80000));
		sa.put(109, new Employee("sachin","development",60000));
		sa.put(10, new Employee("riya","hr",57000));
		sa.put(11, new Employee("anand","sales",59000));
		sa.put(01, new Employee("ajay","devolopment",650000));
		sa.put(201, new Employee("ramesh","marketing",60000));
		sa.put(301, new Employee("avi","hr",55000));

		//System.out.println(sa);
       
		for(Map.Entry<Integer, Employee> ent:sa.entrySet())
		{
			if(ent.getValue().dept.equalsIgnoreCase("hr"))
			{
				System.out.println(ent.getKey()+" "+ent.getValue());
			}
		}
		System.out.println();
		//if we dont override public toString method then print like that
		
		for(Map.Entry<Integer, Employee> ent:sa.entrySet())
		{
			if(ent.getValue().dept.equalsIgnoreCase("hr"))
			{
	System.out.println(ent.getKey()+" "+ent.getValue().dept+" "+ent.getValue().name+" "+ent.getValue().salary);
			}
		}
		
		
	}

}
