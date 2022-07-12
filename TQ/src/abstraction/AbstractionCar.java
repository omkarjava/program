package abstraction;

public class AbstractionCar {
	

	public static void main(String[] args) {
		
		Innovacrysta i=new Innovacrysta();
		
		i.setData(240000, "Toyota");
		System.out.println(i);
		i.dashboard();
		i.engine();
		i.gears();
		i.wheelNo();
		i.noOfSeats();
		i.wheelType();
	
		System.out.println();
		
		Fortuner f=new Fortuner();
		f.setData(3500000, "Toyota");
		System.out.println(f);
		f.dashboard();
		f.engine();
		f.gears();
		f.wheelNo();
		f.noOfSeats();
        f.wheelType();
 
	}

}
