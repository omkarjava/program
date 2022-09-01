package collection;

import java.util.ArrayList;
import java.util.Collections;

public class List {

	public static void main(String[] args) {
		ArrayList<Student> a=new ArrayList<>();
		
		a.add(new Student(1,55,"ram"));
		a.add(new Student(2,56,"avi"));
		a.add(new Student(3,50,"ramesh"));
		a.add(new Student(4,88,"neha"));
		a.add(new Student(5,75,"sachin"));
		
		Collections.sort(a, new Comparator());
		Collections.reverse(a);
		for(Student s:a)
		{
			System.out.println(s);
		}
		
		
		
	}

}
