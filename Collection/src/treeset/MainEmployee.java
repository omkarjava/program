package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class MainEmployee {

	public static void main(String[] args) {
		TreeSet<Employee>et=new TreeSet<>(new ComparatorEmployee());

		et.add(new Employee(12,"ram","hr",75000));
		et.add(new Employee(18,"raj","sales",70000));
		et.add(new Employee(11,"ramesh","hr",50000));
		et.add(new Employee(19,"sachin","marketing",55000));
		et.add(new Employee(17,"neha","sales",85000));
		System.out.println(et);
		System.out.println();
		
		for(Employee e:et)
		{
			System.out.println(e);
		}
		System.out.println();
		Iterator it=et.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
