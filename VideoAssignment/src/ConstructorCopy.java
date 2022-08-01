
public class ConstructorCopy {
	int a;
	String name;
	ConstructorCopy(int a1,String name1)
	{
		 a=a1;
		name=name1;
	}
	ConstructorCopy(){}
	void display()
	{
		System.out.println(a + name);
	}

	public static void main(String[] args) {
	ConstructorCopy c= new ConstructorCopy 	(12,"shaikh");
	ConstructorCopy c1= new ConstructorCopy();	
    c1.a=c.a;
	c1.name=c.name;
     c.display();
     c1.display();
	
	}

}
