package hierachielInheretance;

public class Father {
	String name,surname;
	int age;
	void fatherDetail(String name,String surname,int age)
	{
		this.name=name;
		this.surname=surname;
		this.age=age;
	}
	public void Display()
	{
		System.out.println( name+" "+surname+""+age);
	}

}
