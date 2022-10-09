package containment;

public class C {
	int id,price;
	String name;
 
	C(int id,String name,int price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public String toString ()
	{
		return id+""+name+" "+price;
	}
	
}
