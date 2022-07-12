package parameterisedEmployee;

public class employee {
	int id,salary;
	String name,dept,location;
	employee() 
	{
		
	}
    employee(int id,String name,String dept,String location,int salary)
	{

		this.id=id;
		this.name=name;
		this.dept=dept;
		this.location=location;
		this.salary=salary;
		
	}
	public String toString()
	{
		return id +" "+ name +" "+ dept +" "+ location +" "+ salary ;
	}

	//public static void main(String[] args) {
		

	//}

}
