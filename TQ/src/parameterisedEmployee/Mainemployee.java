   package parameterisedEmployee;

   import java.util.Scanner;

    public class Mainemployee {

	public static void main(String[] args) {
	employee a[]=new employee[2];
		
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<2;i++)
	{ 
	 System.out.println(" Employee "+(i+1)+" Details ");
	    System.out.println("ID ");
		int id=sc.nextInt();
		System.out.println("Name ");
		String name=sc.next();
		System.out.println("Depatment ");
		String dept=sc.next();
		System.out.println("Location ");
		String location=sc.next();
		System.out.println("Salary ");
		int salary=sc.nextInt(); 
		
	   
	a[i]=new employee( id, name, dept, location, salary);
	   	
	}
	for(employee e:a)
	{
		if(e.dept.equals("hr")&& e. salary>=30000)	
		System.out.println(e);
	}
 }

 }
