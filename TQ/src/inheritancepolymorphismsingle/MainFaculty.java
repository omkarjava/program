package inheritancepolymorphismsingle;

import java.util.Scanner;

public class MainFaculty {

	public static void main(String[] args) {
		Faculty f1=new Faculty();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name, add , contact , gender,id,salary,suject,performance");
		String name=sc.next();
		String address=sc.next();
		String contact=sc.next();
		String gender=sc.next();
		int id=sc.nextInt();
		int salary=sc.nextInt();
		String subject=sc.next();
		String performance=sc.next();
        f1.setName(name);
		f1.setAddress(address);
		f1.setContact(contact);
		f1.setGender(gender);
	   // Faculty f1=new Faculty();
	    f1.setId(id);
	    f1.setSalary(salary);
	    f1.setSubject(subject);
	    f1.setPerformance(performance);
	    
		//System.out.println(p1);
		System.out.println(f1);
		f1.bonus();
		
		
	}

}
