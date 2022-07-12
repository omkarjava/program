package overrideninheretance;

public class Bike{
	int price;
	String colour,type,brand;
	
	
	void setData(int price,String colour,String type,String brand)
	{
		this.price=price;
		this.colour=colour;
		this.type=type;
		this.brand=brand;
	}
	void wheelNo()
	{
		System.out.println("2 wheels");
	}
	 void gears()
	 {
		 //super.gears();
		 System.out.println("6 gears");
	 }
	
	public String toString()
	{
		return  price+" "+colour+" "+type+" "+brand;
	}


}
