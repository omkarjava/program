package constructorAssi;

public class Asign {
	int id,price;
	String name,brand;
	
	Asign(int id,String name,String brand,int price)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	Asign(Asign obj)
	{this.id=obj.id;
	this.name=obj.name;
	this.brand=obj.brand;
	this.price=obj.price;
		
	}
	/*void setid(int id)
	{
		this.id=id;
	}
	int getid()
	{
		return id;
	}
	void setname(String name)
	{
		this.name=name;
	}
	String getname()
	{
		return name;
	}
	void setbrand(String brand)
	{
		this.brand=brand;
	}
	String getbrand()
	{
		return brand;
	}
	void setprice(int price)
	{
		this.price=price;
	}
	int getprice()
	{
		return price;
	}
	/*public String toString()
	{
		return" Details="+" "+ id+" " + name+" " + brand+" " + price;
	}*/
	public void Display()
	{
		System.out.println("Details Of cars:"+ id +" "+ name +" "+ brand +" "+ price);
	}

	public static void main(String[] args) {
		/*Asign t =new Asign();
		t.setid(5);
		t.setname("NEXON");
		t.setbrand("TATA");
		t.setprice(800000);
		t.Display();
		//System.out.println(t);*/
		
		Asign m=new Asign(10,"ciaz","suzuki",700000);
		System.out.println( m.id+""+ m.name+" "+ m.brand+" "+ m.price);
		//m.Display();
		//System.out.println(m);
        Asign a=new Asign(m);
        System.out.println( a.id+" "+ a.name+" "+ a.brand+" "+ a.price);
	}

}
