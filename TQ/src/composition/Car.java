    package composition;

    public class Car {
	int id;
	int price;
	String name,model;
	
	Car(int id,String name,String model,int price)
	{
		this.id=id;
		this.name=name;
		this.model=model;
		this.price=price;
	
	}
	public String toString()
	{
		return id+" "+name+" "+model+" "+price;
	}

}
