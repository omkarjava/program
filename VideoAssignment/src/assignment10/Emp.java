package assignment10;

public class Emp {
 
	int id;
	String name;
	String dept;
	Emp(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	public String toString()
	{
		return id+" "+name+" "+dept;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
