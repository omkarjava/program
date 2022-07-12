package abstraction;

public class Fortuner extends Car {
	
	void noOfSeats()
	{
		System.out.println("7");
	}
	 void dashboard()
	 {
		 System.out.println("music,meter,screen,charging,stearingfeatures,pendrive");
	 }
	 void engine()
	 {
		 System.out.println("2400 cc");
	 }
	 void wheelType()
		{
			System.out.println("alloy wheel");
		}
		
	 public String toString()
	 {
		 return "Fortuner"+" "+ brand+" "+ price;
	 }
	
}
