     package parameterised;

     import java.util.Scanner;

     public class MyDate {
	 int day,year;
	 String month;
	
	 MyDate(){}
	 MyDate(int day,String month,int year)
	 {
		this.day=day;
		this.month=month;
		this.year=year;
	 }
	public void Display()
	{
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
	}
	
	

	 @Override
	public String toString() {
		return "MyDate [day=" + day + ", year=" + year + ", month=" + month + "]";
	}
	public static void main(String[] args) {
		Employee e[]=new Employee[2];
		MyDate date []=new MyDate[1];
		System.out.println("Detail Of Employeee");
		 date[0]=new MyDate(5,"march",2011); 
		 MyDate date1 []=new MyDate[1];
		 date1[0]=new MyDate(6,"march",2012);
		 
		 e[0]=new Employee(8,"ram",52000,date);
		
		
	    e[1]=new Employee(9,"raj",2000,date1);
		
	     //e[i]=new Employee(id+name+salary+date);
//		for(int i=0;i<e.length;i++)
//		{  
//			
//			System.out.println(e[i]);
//		
//		}
		
		//System.out.println(m);
		
//		Scanner sc=new Scanner(System.in);
//		MyDate m=new MyDate();
//		Employee a[]=new Employee[2];
//		MyDate b[]=new MyDate[2];
//		for(int i=0;i<2;i++)
//		{
//	System.out.println("Employee:"+(i+1)+"Number");
//	System.out.println("ID ");
//	int id=sc.nextInt();
//    System.out.println("Name ");
//	String name=sc.next();
//	System.out.println("Salary");
//	int salary=sc.nextInt(); 
//	System.out.println("Joining");
//	int joining=sc.nextInt();
//	
//	a[i]=new Employee(id,name,salary,joining);
//	//b[i]=new MyDate(day,month,year)	;	
//	
//		}
//		for(int j=0;j<2;j++)
//		{
//	System.out.println("Employee:"+(j+1)+"Number");
//	System.out.println("Day ");
//	int day=sc.nextInt();
//    System.out.println("Month ");
//	String month=sc.next();
//	System.out.println("Year");
//	int year=sc.nextInt();
//	   b[j]=new MyDate(day,month,year);
//			   
//		}
//	
		for(Employee s:e)
		{
		     if(s.MyDate<2010)
		System.out.println(s);
		}
		
		
		

	}

}
