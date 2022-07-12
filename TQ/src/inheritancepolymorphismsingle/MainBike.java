package inheritancepolymorphismsingle;

public class MainBike {

	public static void main(String[] args) {
		Pulsur p1=new Pulsur();
		p1.setData(10000 ,  "black" ,  "60km/hr ",  "Bajaj");
		p1.pulsurData( 120 ,  "pulsur" ,  "rc" );
		
		System.out.println(p1);
		p1.engine();
		p1.wheelNo();
		 
		p1.gears();
		
		
	}

}
