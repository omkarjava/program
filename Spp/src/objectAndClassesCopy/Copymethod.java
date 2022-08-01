package objectAndClassesCopy;

public class Copymethod implements Cloneable {
	int id;
	String name;
	  
	void copy (int id,String name)
	{
		this.id=id;
		this.name=name;
	}
//	void copy ( )
//	{
//		this.id=id;
//		this.name=name;
//	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	

	public static void main(String[] args) throws CloneNotSupportedException {
		Copymethod c=new Copymethod();
		c.copy(45, "raj");
		c.display();
		//c.copy();
		System.out.println("copy object");
	//	Copymethod c2=new Copymethod (c);
//        c2.copy(8,"ram");
//        c2.display();
		Copymethod c2=(Copymethod)c.clone ();
		
		c2.display();
	}

}
