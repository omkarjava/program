package treemap;

public class Car {
	int price,year;
	String name,brand;
	Car(String name,String brand,int year,int price)
	{
		this.name=name;
		this.brand=brand;
		this.year=year;
		this.price=price;
	}
   
	public String toString()
	{
		return name+" "+brand+" "+year+" "+price;
	}
	
	
	
	
}
