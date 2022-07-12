package abstraction1;

public abstract class Bike {
	
	int price;
	String name,brand;
	void setData(int price,String name,String brand)
	{
		this.name=name;
		this.price=price;
		this.brand=brand;
	}
	void wheelNo()
	{
		System.out.println("Two Wheels");
	}
	void mirror()
	{
		System.out.println("Two Mirror");
	}
	abstract void gears();
	abstract void features();
	abstract  void seatno();
	abstract  void discount();

	void display()
	{
		System.out.println( name +" "+ brand +" "+ price);
	}
}
