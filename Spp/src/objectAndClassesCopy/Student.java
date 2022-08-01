    package objectAndClassesCopy;

    public class Student {
	int id,marks;
	String name;
	Student()
	{
		id=10;
		name="raj";
	    marks=123;
	}
	Student(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	  public String toString()
	{
		return id+" "+name+" "+marks;
	}
	

	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1);
       Student s2=new Student(4,"raya",52);
       System.out.println(s2); 
	}

}
