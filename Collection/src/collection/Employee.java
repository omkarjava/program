package collection;

public class Employee {
	int eid,salary;
	String ename;
	String dept;
	 Employee (int eid,String ename,String dept,int salary)
	 {
		 this.eid=eid;
		 this.salary=salary;
		 this.ename=ename;
		 this.dept=dept;
	 }
    public String toString()
    {
    	return eid+" "+ename+" "+"dept"+" "+salary;
    }

}
