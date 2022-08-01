package collection;

public class Student {
	int id,marks;
	String name,dept;
	Student(int id,String name,int marks,String dept)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.dept=dept;
	}
	public String toString()
	{
		return id+" "+name+" "+marks+" "+dept;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
