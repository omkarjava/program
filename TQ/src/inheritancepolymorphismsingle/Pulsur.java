package inheritancepolymorphismsingle;

public class Pulsur extends Bike {
	
	
	int weight;
	String name,model;
	 void pulsurData(int weight,String name,String model)
	 {
		 this.weight=weight;
		 this.name=name;
		 this.model=model;
		 
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
		 return price+" "+colour+" "+milage+" "+brand+" "+weight+" "+name+" "+model;
	 }
	 
	 
}
