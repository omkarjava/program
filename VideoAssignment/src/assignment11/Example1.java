package assignment11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		ArrayList<Employee>e=new ArrayList<>();
		
		e.add(new Employee(12,"ram","hr",55000,new Profile("india","maharastra")));
		e.add(new Employee(13,"raj","marketing",65000,new Profile("india","gujrat")));
		e.add(new Employee(14,"rahul","sales",75000,new Profile("india","goa")));
		e.add(new Employee(15,"ramesh","hr",45000,new Profile("india","up")));
		e.add(new Employee(19,"neha","sales",58000,new Profile("india","odisa")));
//		e.add(new Employee(10,"nisha","development",59000));
//		e.add(new Employee(21,"neha","sales",58000));
		Collections.sort(e);
		System.out.println(e);
		
		
	}

}
