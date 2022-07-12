package override;

public class Student {
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		super.toString();
		return id+" "+name;
	}

	public static void main(String[] args) {
		Student s=new Student(5,"ram");
		Student s1=s;
		System.out.println(s);
		System.out.println(s1);
	}

}
