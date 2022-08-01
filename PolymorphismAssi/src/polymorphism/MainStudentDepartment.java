package polymorphism;

public class MainStudentDepartment {

	public static void main(String[] args) {
		Department dept1=new Department(55, "mech");	
		Student s1=new Student(12, "ram", dept1);
			
		System.out.println(s1);

	}

}
