package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEmployee {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		ArrayList<Employee>al1=new ArrayList<>();
		
		
		al1.add(new Employee(1,60000,"raj"));
		al1.add(new Employee(10,80000,"ram"));
		al1.add(new Employee(13,50000,"nisha"));
		al1.add(new Employee(18,40000,"tina"));
		al1.add(new Employee(19,90000,"mamta"));
		al1.add(new Employee(14,20000,"lian"));
		al1.add(new Employee(16,40000,"ramesh"));
		al1.add(new Employee(11,90000,"pooja"));
		al1.add(new Employee(132,20000,"li"));
		
		Collections.sort(al1);
		Collections.reverse(al1);
		System.out.println(al1);
		
		
	}

}
