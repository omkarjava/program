package comparable;

public class Employee implements Comparable<Employee> {
	int id,salary;
	String name;
	 Employee (int id,int salary,String name)
	 {
		 this.id=id;
		 this.salary=salary;
		 this.name=name;
	 }
    public String toString()
    {
    	return id+" "+name+" "+salary;
    }

    public int compareTo(Employee e)
    {
//    	if(this.id>e.id)
//    		return -1;
//    	else if(this.id<e.id)
//    		return 1;
//    	else
//    		return 0;
    	//return this.name.compareTo(e.name);
    	if(this.salary>e.salary)
    		return -1;
    	else if(this.salary<e.salary)
    		return 1;
    	else
    		if(this.id>e.id)
        		return -1;
    		else if(this.id<e.id)
        		return 1;
        	else
        		return 0;
    		
  
    	
    	
    }
    
    
    
    
    
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
