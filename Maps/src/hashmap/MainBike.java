package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class MainBike {

	public static void main(String[] args) {
		HashMap<Bike,Integer>bk=new HashMap<>();
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter id + name + colour");
//		int id=sc.nextInt();
//		String name=sc.next();
//		String 
		bk.put(new Bike(12,"Bullet","red"), 250000);
		bk.put(new Bike(10,"pulser","black"), 10000);
		bk.put(new Bike(11,"splender","grey"), 95000);
		bk.put(new Bike(9,"shine","black"), 110000);
		bk.put(new Bike(5,"activa","white"), 100000);
          
		System.out.println(bk);
		
		
		
		
	}

}
