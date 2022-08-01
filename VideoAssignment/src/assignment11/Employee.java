package assignment11;

public class Employee implements Comparable<Employee>{
 
	int id,salary;
	String name,dept;
	Profile p;
	Employee(int id,String name,String dept,int salary,Profile p)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.p=p;
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary+" "+p;
	}
	  
	 public int compareTo(Employee a)
	 	{
	 		if(this.p.country.equals(a.p.country))
	 		{
	 			return this.p.state.compareTo(a.p.state);
	 		 
	 		}
	 		else
	 			return this.p.country.compareTo(a.p.country);
	 	
	     
	     
	 	}
	     
	
	
	
	
}
