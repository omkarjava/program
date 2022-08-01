package objectAndClassesCopy;

public class Copyobjectusingconstructor {
	
	int id;
	String name;
	  
	Copyobjectusingconstructor (int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	Copyobjectusingconstructor ( Copyobjectusingconstructor a)
	{
		this.id=a.id;
		this.name=a.name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		 Copyobjectusingconstructor c= new Copyobjectusingconstructor(12,"ram");
		 c.display();
		 Copyobjectusingconstructor d= new Copyobjectusingconstructor(c);
		 d.display();
	}

}
