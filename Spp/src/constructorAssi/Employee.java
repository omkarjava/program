    package constructorAssi;

    public class Employee {
	int employeeid,salary;
	private String name;
	Employee()
	{
		
	}
	Employee(int employeeid ,String name,int salary)
	{
		this.employeeid=employeeid; 
		this.name=name;
		this.salary=salary;
	}
	 void setemployeeid(int employeeid)
	{
		this.employeeid=employeeid;
	}
	int getemployeeid()
	{
		return employeeid;
	}
	 void setname(String name)
	{
		this.name=name;
	}
	String getname()
	{
		return name;
	}
	 void setsalary(int salary)
	{
		this.salary=salary;
	}
	int getsalary()
	{
		return salary;
	}
	/*public String toString()
	{
		return employeeid+" "+name+" "+salary;
	}*/
	void display()
	{
		System.out.println("Employee Details:"+ employeeid +" "+ name+" " + salary);
	}
	public static void main(String[] args) {
		Employee s=new Employee();
		s.setemployeeid(10);
		s.setname("ram");
		s.setsalary(75000);
	     s.setname("raj");
		//System.out.println("Employee Details:"+s);
		s.display();
	    
		
	    Employee e=new Employee(12,"Raj",55000);
	    e.display();
	    //System.out.println("Employee Details:"+e);
        Employee m=new Employee();
	    m.display();
	}

}
