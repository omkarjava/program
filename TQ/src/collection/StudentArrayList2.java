package collection;

import java.util.ArrayList;
import java.util.Scanner;

    public class StudentArrayList2 {

	public static void main(String[] args) {
		ArrayList<Student> s=new ArrayList<>();
		 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the How Many Students");
		int d=sc.nextInt();
		char c=' ';
		do
		{
//		for(int i=0;i<=d;i++)
//		{
			System.out.println("Enter StudentId  StudentName StudentMarks  StudentDept");// Of Student "+(i+1));
			int id=sc.nextInt();
			String name=sc.next();
			int marks=sc.nextInt();
			String dept=sc.next();
			s.add(new Student(id,name,marks,dept));
			System.out.println("Add next Student (Y/N)");
			c=sc.next().charAt(0);
		//}
		}
		while(c=='Y');
		for(Student a:s)
		{
			if(a.dept.equalsIgnoreCase("comp")&&a.marks>60)
			System.out.println(a);
		}
		
		
	
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
