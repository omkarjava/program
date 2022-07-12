package abstraction;

public abstract class Innova extends Car {
	
	
	void noOfSeats()
	{
		System.out.println("7");
	}
	 void dashboard()
	 {
		 System.out.println("music,meter,screen,charging");
	 }
	 void engine()
	 {
		 System.out.println("2000 cc");
	 }
	 void wheelNo()
		{
			System.out.println("5 wheels");
		}
	 public String toString()
	 {
		 return "Innova "+" "+ brand+" "+ price;
	 }
	

}
