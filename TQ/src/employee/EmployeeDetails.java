package employee;
      import java.util.Scanner;

      public class EmployeeDetails {

	  public static void main(String[] args) {
		Employee e[]=new Employee[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		 {
			System.out.println("Employee:"+(i+1)+"Number");
			System.out.println("ID ");
			int id=sc.nextInt();
			System.out.println("Name ");
			String name=sc.next();
			System.out.println("Depatment ");
			String dept=sc.next();
			System.out.println("Salary ");
			int salary=sc.nextInt(); 
			System.out.println("Location ");
			String location=sc.next(); 
			 
			Employee s =new Employee();
			 s.setid( id );   
			 s.setname( name );
			 s.setdept( dept );
			 s.setsalary( salary );
			 s.setlocation(location);
			   
			 e[i]=s;
		 }
		for(Employee b:e)
	    {
			if(b.getdept().equals("hr")&& b.getsalary()>=30000)
				
		 System.out.println( b );
		
		 
	    }
	 
		 

	}

}
