package inheritancepolymorphismsingle;

public class Faculty extends Person {
	int id,salary;
	String subject;
	String performance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	
	
	void bonus()
	{
		if(performance.equalsIgnoreCase("A"))
    	{
    	salary=salary*15/100+salary;
    	System.out.println("Bonus salary:"+salary);	
    	}
    	if(performance.equalsIgnoreCase("B"))
    	{
    	salary=salary*10/100+salary;
    	System.out.println("Bonus salary:"+salary);	
    	}
    	if(performance.equalsIgnoreCase("C"))
    	{
    	salary=salary*5/100+salary;
        System.out.println("Bonus salary:"+salary);		
    	}
    	if(performance.equalsIgnoreCase("D")) 
    	{
        System.out.println("No Bonus salary:"+salary);	
    	}
    		
		
		
	}
	public String toString()
	{
	return name+" "+contact+" "+address+" "+gender+" "+id+" "+salary+" "+subject+" "+performance;	
	}

}
