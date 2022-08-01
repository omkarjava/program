package hashmap;

public class CustomizedEmployeeKey {

	int id;
	String name,dept;
	CustomizedEmployeeKey(int id, String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	public String toString()
	{
		return id+" "+name+" "+dept;
	}

	
}
