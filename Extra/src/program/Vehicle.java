   package program;

   public class Vehicle {
	int id;
	String name;
	Vehicle(){} 
	Vehicle(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	Vehicle(Vehicle ve)
	{
		this.id=ve.id;
		this.name=ve.name;
	}
	
	public String toString()
	{
		return id+" "+ name;
	}

	public static void main(String[] args) {
	   Vehicle v=new Vehicle(4,"ram");
	   System.out.println(v);
	   System.out.println("break");
	   Vehicle v1=new Vehicle(v);
	   System.out.println(v1);
	   
		
		
		
	}

}
