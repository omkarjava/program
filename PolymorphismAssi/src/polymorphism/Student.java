package polymorphism;

public class Student {
	
	int rollno;
	String name;
	Department dept;
	
	Student(int rollno,String name,Department dept)
	{
		this.rollno=rollno;
		this.name=name;
		this. dept=dept;;
		
	}
	public String toString()
	{
		return rollno +" "+ name+" "+ dept;
	}

	public static void main(String[] args) {
		
	}

}
