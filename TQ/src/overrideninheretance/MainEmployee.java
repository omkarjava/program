    package overrideninheretance;

import java.util.Scanner;

public class MainEmployee {

	public static void main(String[] args) {
	System.out.println("Employee");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Employee");
	 System.out.println("");
		Employee e=new Employee();
		e.personData ("raj"," pune","62564532");
		e.employee(5, 26000, "Hr");
		e.employeePf();
		e.display();
        System.out.println("Student");
		Student s=new Student();
		s.personData ("ram"," pune","62545632");
		s.studentDetail(4,85,"electrical");
		s.grade(80);
		s.display();
		
		
		
		
	}

}
