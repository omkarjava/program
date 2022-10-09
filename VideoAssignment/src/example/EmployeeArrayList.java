    package example;

    import java.util.ArrayList;
import java.util.Collections;

    public class EmployeeArrayList {

	public static void main(String[] args) {
	 ArrayList<Employee>al=new ArrayList<>(); 
     al.add(new Employee(1,"ram","it",50000));
     al.add(new Employee(3,"raj","cs",55000));
     al.add(new Employee(5,"neha","development",81000));
     al.add(new Employee(4,"praju","sales",60000));
     al.add(new Employee(2,"ramesh","it",50000));
//	for(Employee e:al)
//	{
//		int sal=0;
//		if(e.salary!=0)
//		{
//			 sal=50+e.salary;
//			// System.out.println(e.name+" "+sal);
//		}
//	    if(sal>80000)
//		{
//			System.out.println(e.name+" "+sal);
//		}
//		
//	}
     Collections.sort(al);
	System.out.println(al);
	
	
	}

}
