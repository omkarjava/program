package inheritanceGetterSetter;

public class Car1 {
	int id;
	String brand,name;
	Driver1 d;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Driver1 getD() {
		return d;
	}



	public void setD(Driver1 d) {
		this.d = d;
	}
   
	public String toString() 
	{
	  return id+" " + brand +" " + name + " "+ d;	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
