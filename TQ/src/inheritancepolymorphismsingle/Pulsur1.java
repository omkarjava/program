package inheritancepolymorphismsingle;

public class Pulsur1 extends Bike1 {
	int weight;
	String name,model;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	 void gears()
	 {
		 System.out.println("4 gears");
	 }
	 void engine()
	 {
		 System.out.println("220cc");
	 }
    
	public String toString()
	{
		return brand+" "+name +" "+weight+" "+model+" "+colour+" "+price+" "+milage;
	}
	
	
	
	
}
