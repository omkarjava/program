package parameterised;

import java.util.Scanner;

public class Student8 {
	int roll,age,marks;
	String name;
	Student8(){}
	Student8(int roll,String name,int age,int marks)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
		
	}
	public String toString()
	{
		return roll +" "+ name+" "+ age+" "+ marks;
	}

	public static void main(String[] args) {
		Student8 a[]=new Student8[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{

	 System.out.println("Student:"+(i+1)+"Number");
	 System.out.println("Roll ");
	 int roll=sc.nextInt();
	 System.out.println("Name ");
	 String name=sc.next();
	 System.out.println("Age");
	 int age=sc.nextInt(); 
	 System.out.println("Marks");
	 int marks=sc.nextInt(); 
	  
	 a[i]=new Student8(roll,name,age,marks);
	 
		}
		
		for(Student8 e:a)
		{
			if(e.marks>60&&e.age<15)
			System.out.println(e);	
		}
		

	}

}
