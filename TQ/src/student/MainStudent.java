package student;
import java.util.Scanner;

public class MainStudent {
	
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
		
		Student s1= new Student();
		
		 s1.setid( id );   
		 s1.setname( name );
		 s1.setdept( dept );
		 s1.setmarks( marks );
		
		 st[i]=s1;
		 	 
	     } 
	   for(Student b:st)
	    {
		 System.out.println( b );
	    }
	 
	
	}

}
