package arrayListContainment;

public class Employee {
	
	
	int eid,salary;
	String ename;
	 Employee (int eid,int salary,String ename)
	 {
		 this.eid=eid;
		 this.salary=salary;
		 this.ename=ename;
	 }
    public String toString()
    {
    	return eid+" "+ename+" "+salary;
    }
}
