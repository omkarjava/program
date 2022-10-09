package example;

import java.util.ArrayList;

public class Student {
  
	int id,marks;
	String name,dept;
	ArrayList<Course>cs;
	Student(int id,String name,String dept,int marks,ArrayList<Course>cs)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
		this.cs=cs;
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks+" "+cs;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
