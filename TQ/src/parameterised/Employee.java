package parameterised;

import java.util.Arrays;

public class Employee {
	int id,salary;
	String name;
	int MyDate;
	MyDate datejoining[];
	
	Employee()
	{}
	Employee(int id,String name,int salary, MyDate[]date)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.datejoining=date;
	}
	public void Display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	//	System.out.println(datejoining);
		//return  id +" " + name +" "+ salary + Arrays.deepToString(datejoining) ;
	}
//	public void setMyDate(MyDate da)
//	{
//		this.MyDate=da;
//	}
	
	
	

	public static void main(String[] args) {
		

	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", MyDate=" + MyDate + ", datejoining="
				+ Arrays.toString(datejoining) + "]";
	}

}
