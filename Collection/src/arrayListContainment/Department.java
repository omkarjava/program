package arrayListContainment;

import java.util.ArrayList;

public class Department {
	
	
	
	int id;
	String name;
	ArrayList<Employee> emp;
	Department (int id,String name,ArrayList<Employee> emp)
	{
		this.id=id;
		this.name=name;
		this.emp=emp;
	}
	public String toString()
	{
		return id+" "+name+" "+emp;
	}
}
