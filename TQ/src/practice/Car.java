package practice;

public class Car {

	int id,price;
	String name,brand,colour;
	
	Car(int id,String name,String brand,int price, String colour)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.colour=colour;
	}
	
	public String toString()
	{
		return id+" "+name+" "+brand+" "+price+" "+colour;
	}
}
