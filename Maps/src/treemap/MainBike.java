package treemap;



import java.util.TreeMap;

public class MainBike {

	public static void main(String[] args) {
		TreeMap<Bike,Integer> bt=new TreeMap<>(new BikeNameComparator());

		bt.put(new Bike(12,"Bullet ","Royal"),250000);
		bt.put(new Bike(11,"pulser ","Bajaj"),115000);
		bt.put(new Bike(1,"R15","Yamaha"),155000);
		bt.put(new Bike(5,"ZMR","Hero"),150000);
		bt.put(new Bike(9,"Shine","Honda"),110000);
		bt.put(new Bike(2,"Bullet ","Royal"),250000);
		
     
        System.out.println(bt);
//
//		System.out.println(bt.containsKey(new Bike(12,"Bullet ","Royal")));
//		
		
	}

}
