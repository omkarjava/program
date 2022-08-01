package constructor;

public class Employee {
	int id,salary;
	String firstname, lastname, department, design;
	Employee(){}
		/*id=10;
		firstname="ram";
		lastname="sdf";
		department="ele";
		design="hgy";
		salary=2000;
	}*/
	
	void setid(int id)
	{
		this.id=id;
	}
	int getid()
	{
		return id;
	}
	void setfirstname(String firstname )
	{
		this.firstname=firstname;
	}
	String getfirstname()
	{
		return firstname;
	}
	void setlastname(String lastname )
	{
		this.lastname=lastname;
	}
	String getlastname()
	{
		return lastname;
	}
	void setdepartment(String department )
	{
		this.department=department;
	}
	String getdepartment()
	{
		return department;
	}
	void setdesign(String design )
	{
		this.design=design;
	}
	String getdesign()
	{
		return design;
	}
	void setsalary(int salary )
	{
		this.salary=salary;
	}
	int getsalary()
	{
		return salary;
	}
	
	public String toString()
	{
		return  id+" " + firstname+" " + lastname+" " + department+" " +design+" "+salary ;
		
	}
	

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		e1.setid(5);
		e1.setfirstname("sham");
		e1.setlastname("mane");
		e1.setdepartment("mech");
		e1.setdesign("eng");
		e1.setsalary(500 );
		
	    System.out.println("Employee Detail:"+e1); 
		//System.out.println(e1);
	    
	    
	    
		Employee e2=new Employee();
		
		e2.setid(5);
		e2.setfirstname("ram");
		e2.setlastname("pawar");
		e2.setdepartment("medical");
		e2.setdesign("acc");
		e2.setsalary(500 );
		
		System.out.println("Employee Detail:"+e2);
	}

}
