package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import arrayListContainment.Employee;

public class Theater {
	
	int id;
	String name;
	ArrayList<Movie>mo;
	Theater (int id,String name,ArrayList<Movie>mo)
	{
		this.id=id;
		this.name=name;
		this.mo=mo;
	}
	public String toString()
	{
		return id+" "+name+" "+mo;
	}
	
	
}
