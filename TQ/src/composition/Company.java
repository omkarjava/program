package composition;

public class Company {
	int id,year;
	String name;
	  Car c;
	Company(int id,String name,int year,int cid,String cname,String cmodel,int cprice)
	{
		this.id=id;
		this.name=name;
		this.year=year;
		this.c=new Car( cid, cname, cmodel,cprice);
	}
	public String toString()
	{
		return id +" "+ name +" "+ year +" "+ c;
	}

}
