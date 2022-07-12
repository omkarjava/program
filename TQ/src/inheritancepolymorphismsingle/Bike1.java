package inheritancepolymorphismsingle;

public class Bike1 {
	int price;
	String colour,milage,brand;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getMilage() {
		return milage;
	}
	public void setMilage(String milage) {
		this.milage = milage;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	void wheelNo()
	{
		System.out.println("2 wheels");
	}
	
	
	
//	public String toString()
//	{
//	return price+" "+colour+" "+milage+" "+brand;
//	}

}
