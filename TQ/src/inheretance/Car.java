package inheretance;

public class Car {
	
	String name,brand;
	int launchyear,price;
	
//	void setData(String name,String brand,int launchyear,int price)
//	{
//		this.name=name;
//		this.brand=brand;
//		this.launchyear=launchyear;
//		this.price=price;
//	}
	
	void display()
	{
		System.out.println(name+" "+brand+" "+launchyear+" "+price);
	}

//	public String getName() {
//		return name;
//	}

	public void setName(String name) {
		this.name = name;
	}

//	public String getBrand() {
//		return brand;
//	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

//	public int getLaunchyear() {
//		return launchyear;
//	}

	public void setLaunchyear(int launchyear) {
		this.launchyear = launchyear;
	}

//	public int getPrice() {
//		return price;
//	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	

}
