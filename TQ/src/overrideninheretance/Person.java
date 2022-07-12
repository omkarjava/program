package overrideninheretance;

public class Person {
	
	String name,add,contact;
	
	
	void personData (String name,String add,String contact)
	{
		this.name=name;
		this.add=add;
		this.contact=contact;
	}

	void display()
	{
	System.out.println(name+" "+add+" "+contact);
	}

}
