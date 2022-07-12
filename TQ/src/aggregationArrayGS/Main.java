        package aggregationArrayGS;

        import java.util.Scanner;


        public class Main {

	    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Department dept[]=new Department[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("enter id , name. : student list: of the " +" "+(i+1)+" "+ "Department");
			int did=sc.nextInt();
			String dname=sc.next();
			Student  stud[]=new Student[3];
		  for(int j=0;j<3;j++)	
		  {
		   
		   System.out.println("Enter id , name , marks , contact of the"+" "+(j+1)+" "+ "student");
		   int id=sc.nextInt();
		   String name=sc.next();
		   int marks=sc.nextInt();
		   String contact=sc.next();
	
		   Student stud1= new Student();
		   stud1.setId(id);
		   stud1.setName(name);
		   stud1.setMarks(marks);
		   stud1.setContact(contact);
		    
		   stud[j]=stud1;
		  }
		     Department d1=new Department();
		     d1.setDid(did);
		     d1.setDname(dname);
		     d1.setstud(stud);
		     dept[i]=d1;
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
