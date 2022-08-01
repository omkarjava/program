      package constructorAssi;

      import java.util.Scanner;

     public class Copy {
	private int id,salary;
	private String name,dept;
	
	Copy(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		
	}
	 public int getid()
	{
		return id;
	} 
	 public void setid(int id )
	 {
		 this.id=id;
	 }
	 public String getname()
		{
			return name;
		} 
		 public void setname(String name)
		 {
			 this.name=name;
		 }
		 public String getdept()
			{
				return dept;
			} 
			 public void setdept(String dept )
			 {
				 this.dept=dept;
			 }
			 public int getsalary()
				{
					return salary;
				} 
				 public void setsalary(int salary )
				 {
					 this.salary=salary;
				 }	 
	 public void display()
	 {
		System.out.println("Details:"+id+" "+name+" "+dept+" "+salary); 
	 }

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id + name + dept + salary ");
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		int salary=sc.nextInt();
       Copy c1=new Copy(id,name,dept,salary);
       Copy c2=new Copy(c1.getid(),c1.getname(),c1.getdept(),c1.getsalary());
	  // c1.display();
	   c2.display();
	}

}
