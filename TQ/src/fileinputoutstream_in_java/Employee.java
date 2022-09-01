package fileinputoutstream_in_java;

import java.io.Serializable;

public class Employee implements Serializable{
	
	
	int id,salary;
	String name,dept;
	public Employee(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
     public String toString()
     {
    	 return id+" "+name+" "+dept+" "+salary;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
