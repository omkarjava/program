    package classesandobject;

    import java.util.Scanner;

    public class objectEmployee {
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
	public String toString()
	{
	return id+" "+name+" "+dept+" "+designation+" "+salary+" "+rating;
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
		int id,salary;
		String name,dept,designation,rating;
		Scanner sc= new Scanner (System.in);	
		System.out.println("enter id,name,dept,designation,rating,salary:");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		designation=sc.next();
		rating=sc.next();
		salary=sc.nextInt();
		
		objectEmployee  e1=new objectEmployee();
		e1.inputData( id,name,dept,designation,rating,salary);
		System.out.println(e1);
		e1.rating();
		
		
		
		objectEmployee  e2=new objectEmployee();
		System.out.println("enter id,name,dept,designation,rating,salary:");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		designation=sc.next();
		rating=sc.next();
		salary=sc.nextInt();
		e2.inputData(id,name,dept,designation,rating,salary);
		System.out.println(e2);
		e2.rating();
		
		 

		objectEmployee  e3=new objectEmployee();
		System.out.println("enter id,name,dept,designation,rating,salary:");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		designation=sc.next();
		rating=sc.next();
		salary=sc.nextInt();
		
		e3.inputData(id,name,dept,designation,rating,salary);
		System.out.println(e3);
		e3.rating();
		
		
		objectEmployee e4=new objectEmployee ();
		System.out.println("enter id,name,dept,designation,rating,salary:");
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		designation=sc.next();
		rating=sc.next();
		salary=sc.nextInt();
		e4.inputData(id,name,dept,designation,rating,salary);
		System.out.println(e4);
		e4.rating();
		

	
	

	}

    }
