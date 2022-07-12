package containment;

public class Company1 {
	int id,year;
	String name;
	  Car1 ca;
	  

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Car1 getCa() {
		return ca;
	}


	public void setCa(Car1 ca) {
		this.ca = ca;
	}
	public String toString()
	{
		return id+" "+name+" "+year+" "+ca;
	}


	public static void main(String[] args) {
		
	}

}
