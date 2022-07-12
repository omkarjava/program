package containment;

public class Company {
	int id,year;
	String name;
	  Car ca;
	Company(int id,String name,int year,Car ca)
	{
		this.id=id;
		this.name=name;
		this.year=year;
		this.ca=ca;
	}
	public String toString()
	{
		return id+" "+name+" "+year+" "+ca;
	}
	
	
	

}
