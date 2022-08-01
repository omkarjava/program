package assignment_4;

public class Student {
	int id=8;
	StringExample name;
	Student ()
	{
		
		
		
		
		
		
	}
	
	
	public String toString()
	{
		return name+" "+id;
	}
	public static void main(StringExample[] args) {
		Student s=new Student();
		System.out.println(s);
//		Student s1=new Student();
//        System.out.println(s1);
//		
        Student s1=s;
		System.out.println(s1);
		
	}

}
