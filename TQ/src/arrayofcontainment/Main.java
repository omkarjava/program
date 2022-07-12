        package arrayofcontainment;

        import java.util.Arrays;
        import java.util.Scanner;

        public class Main {

	    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Department dept[]=new Department[2];
		//Student  stud[]=new Student[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("enter id , name. : student list: of the "+(i+1)+"Department");
			int did=sc.nextInt();
			String dname=sc.next();
			Student  stud[]=new Student[2];
		  for(int j=0;j<2;j++)	
		  {
		   System.out.println("Enter id , name , marks , contact of the"+(j+1)+"student");
		   int id=sc.nextInt();
		   String name=sc.next();
		   int marks=sc.nextInt();
		   String contact=sc.next();
		
		    stud[j]=new Student(id,name,marks,contact);
		  }
			dept[i]=new Department(did,dname,stud);
			
		}
		
			
			for(Department d:dept)
			{
				for(Student s:d.stud)
				{
				 if(s.marks>60)
				 {
				  System.out.println(d.dname+" "+s.name+" "+s.marks);
				 }
				}
			}	
		
		
		
		
		
		

	}

}
