package overrideninheretance;

public class Employee extends Person{
	int eid,salary;
	//float pf;
	String edept;
	void employee(int eid,int salary,String edept)
	{
		this.eid=eid;
		this.salary=salary;
		this.edept=edept;
	}
	void employeePf()
	{
		float pf;
		if(salary>=25000)
		 {
		  pf=salary*15/100;
		  System.out.println("Pf is"+" "+pf);
		 }
		else if(salary>=20000)
		 {
		  pf=salary*10/100;	
		 }
		if(salary>=15000)
		 {
		  pf=salary*5/100;		
		 }
			
	}
	void display()
	
	{
		super.display();
		System.out.println(eid+" "+salary+" "+edept);
	}

}
