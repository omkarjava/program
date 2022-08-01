package ArrayListContainment;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDept {

	public static void main(String[] args) {
		ArrayList<Department> dept=new ArrayList<>();
		
		Scanner sc=new Scanner (System.in);
        System.out.println("Department size");
        int s=sc.nextInt();
        for(int i=0;i<s;i++)
        {
        	System.out.println("Department id + name");
        	int id=sc.nextInt();
        	String name=sc.next();
        	ArrayList<Employee> emp=new ArrayList<>();
        	for(int j=0;j<2;j++)
        	{
        		System.out.println("Employee id + name + salary");
        		int eid=sc.nextInt();
            	String ename=sc.next();
        		int salary=sc.nextInt();
        		emp.add(new Employee(eid,salary,ename));
        		
        	}
        	
        	dept.add(new Department(id,name,emp));
        }
       for(Department d:dept)
       {
    	   for(Employee e:d.emp)
    	   {
    		   if(e.salary>60000)
    		   {
    			   System.out.println(e.ename+" "+e.salary+" "+d.name);
    		   }
    	   }
       }
        
        
	}

}
