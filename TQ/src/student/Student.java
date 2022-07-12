package student;

public class Student {
	int id,marks;
	String name,dept;
	 
	void setid(int id)
	{
		this.id=id;
	}
	int getid()
	{
		return id;
	}
	void setname(String name)
	{
		this.name=name;	
	}
	String getname()
	{
		return name;
	}
	void setdept(String dept)
	{
		this.dept=dept;	
	}
	String getdept()
	{
		return dept;
	}
	
	void setmarks(int marks)
	{
		this.marks=marks;	
	}
	int getmarks()
	{
		return marks;
	}
	 public String toString()
	 {
		 return id + name + dept + marks ;
	 }
	
	
	public static void main(String[] args) {
		
	}
    }
	

	
