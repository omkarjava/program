package inheritancepolymorphismsingle;

public class Bike {
	
	int price;
	String colour,milage,brand;
	
	
	void setData(int price,String colour,String milage,String brand)
	{
		this.price=price;
		this.colour=colour;
		this.milage=milage;
		this.brand=brand;
	}
	void wheelNo()
	{
		System.out.println("2 wheels");
	}
	

}
