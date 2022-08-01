package arrayListContainment;

import java.util.ArrayList;

public class Company {
	
	int id;
	String name;
	ArrayList<Car> ca;
	Company (int id,String name,ArrayList<Car>ca)
	{
		this.id=id;
		this.name=name;
		this.ca=ca;
	}
	public String toString()
	{
		return id+" "+name+" "+ca;
	}
   
}
