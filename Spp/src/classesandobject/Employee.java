package classesandobject;

public class Employee {
	int id,salary;
	String name,dept,designation,rating;
	void inputData(int i,String a,String b,String c,String d,int h)
	{
		id=i;
		name=a;
		dept=b;
		designation=c;
		salary=h;
		rating=d;			
				
	}
	void display()
	{
	System.out.println(id+" "+name+" "+dept+" "+designation+" "+salary+" "+rating);
	}
    void rating ()
    {
    	if(rating.equals("A"))
    	{
    	salary=salary*15/100+salary;
    	System.out.println("Bonus salary:"+salary);	
    	}
    	if(rating.equals("B"))
    	{
    	salary=salary*10/100+salary;
    	System.out.println("Bonus salary:"+salary);	
    	}
    	if(rating.equals("C"))
    	{
    	salary=salary*5/100+salary;
        System.out.println("Bonus salary:"+salary);		
    	}
    	if(rating.equals("D")) 
    	{
        System.out.println("No Bonus salary:"+salary);	
    	}
    	
    }
    
    
	public static void main(String[] args) {
		Employee  e1=new Employee ();
		Employee  e2=new Employee ();
		Employee  e3=new Employee ();
		e1.inputData(1," ram", "electrical","engineer","A",10000);
		e1. display();
		e1.rating();
		System.out.println();
		 

		e2.inputData(2," raj", "electrical","engineer","B",8000);
		e2. display();
		e2.rating();
		System.out.println();
		

		e3.inputData(3," jay", "electrical","engineer","C",6000);
		e3. display();
		e3.rating();
		System.out.println();
		
        Employee e4=new Employee();
		e4.inputData(4," sham", "electrical","engineer","D",4000);
		e4. display();
		e4.rating();
		System.out.println();

	}

}
