      package parameterisedStudent;

      import java.util.Scanner;

import parameterisedEmployee.employee;



      public class Student {
	  int id,marks;
	  String name,dept;
	  Student()
	  {}
	  Student(int id,String name,String dept,int marks)
	  {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	  }
	  public String toString()
	  {
		 return id + name + dept + marks ;
	  }

	  public static void main(String[] args) {
		 Student st[]=new Student[2];
		   Scanner sc =new Scanner (System.in);
		   
		for(int i=0;i<2;i++)
		 {
		  System.out.println("Enter " +(i+1)+ "Student Details");
		  System.out.println("ID ");
		  int id=sc.nextInt();
		  System.out.println("Name ");
		  String name=sc.next();
		  System.out.println("Depatment ");
		  String dept=sc.next();
		  System.out.println("Marks ");
			int marks=sc.nextInt(); 
			
		st[i]=new Student(id,name,dept,marks)	;
		
         
	   }
		for(Student e:st)
		{
			if(e.dept.equals("Science")&& e. marks>=35)	
			System.out.println(e);
		}
	}
}
