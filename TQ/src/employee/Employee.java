package employee;

public class Employee {
	  int id,salary;
	  String name,dept,location;
	  
	 public void setid(int id)
	  {
		  this.id=id;	  
	  }
	 public  int getid() 
	  {
		return id;  
	  }
	 public  void setname(String name)
	  {
		  this.name=name;
	  }
	 public   String getname()
	  {
		  return name;
	  }
	 public   void setdept(String dept)
	  {
		  this.dept=dept;
	  }
	 public   String getdept()
	  {
		  return dept;
	  }
	 public   void setsalary(int salary)
	  {
		  this.salary=salary;	  
	  }
	 public   int getsalary() 
	  {
		return salary;  
	  }
	 public   void setlocation(String location)
	  {
		  this.location=location;
	  }
	 public  String getlocation()
	  {
		  return location;
	  }
	  
	  public String toString() 
	  {
		 return id +" " + name+" " + dept+" " + salary+" " + location ; 
	  }
	  

	public static void main(String[] args) {
	

	}

}
