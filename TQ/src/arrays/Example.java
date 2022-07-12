    package arrays;

    import java.util.Scanner;

    public class Example {
	int id ,salary;
	String name;
	Example(){}
	
	 Example(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	 
	 public String toString ()
	 {
	   return  id +" "+ name+" "+salary;	 
	 }
	

	public static void main(String[] args) {
	
	Example e[]=new Example[2];
    Scanner sc=new Scanner(System.in);	
	
	for(int i=0;i<2;i++)
	   {

		System.out.println("Employee:"+(i+1)+"Number");
		System.out.println("ID ");
		int id=sc.nextInt();
		System.out.println("Name ");
		String name=sc.next();
		System.out.println("Salary ");
		int salary=sc.nextInt(); 
	   
	    //Example s=new Example();
	   // s.display(id, name, salary);
	    e[i]= new Example(id,name,salary);
	    
	    
	   }
	for(Example a:e)
	{  
		if(a.salary>10000)
		System.out.println(a);
	}
	   
	    

	}

}
