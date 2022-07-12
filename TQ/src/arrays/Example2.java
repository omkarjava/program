package arrays;

import java.util.Scanner;

public class Example2 {
	int id ,salary;
	String name;
	Example2(){}
	
	 Example2(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return id +" "+ name+" "+ salary;
	}

	public static void main(String[] args) {
		Example2 c[]=new Example2[2];
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
			   
		// Example s=new Example();
	   c[i]= new Example2(id,name,salary);
			    
			    
	 }
	for(Example2 a:c)
		{
		if(a.salary>10000)
		System.out.println(a);
		}
			   

	}

}
