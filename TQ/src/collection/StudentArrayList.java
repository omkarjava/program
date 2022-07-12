package collection;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student> s=new ArrayList<>();
		
		s.add(new Student(12,"ram",65,"mech"));
		s.add(new Student(13,"raj",75,"ele"));
		s.add(new Student(14,"rakesh",55,"civil"));
		s.add(new Student(15,"pooja",45,"comp"));
		s.add(new Student(16,"sayali",85,"ele"));
		s.add(new Student(17,"anand",95,"comp"));
		s.add(new Student(19,"amol",65,"mech"));
		s.add(new Student(11,"rahul",88,"civil"));
		s.add(new Student(20,"sachin",69,"comp"));
		s.add(new Student(21,"amit",52,"mech"));
		s.add(new Student(31,"sam",50,"civil"));
		
		for(Student a:s)
		{
			if(a.dept.equalsIgnoreCase("comp")&&a.marks>60)
			System.out.println(a);
		}
		
		
	}

}
