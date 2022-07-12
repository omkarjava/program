package inheritancepolymorphismsingle;

import java.util.Scanner;

public class Mainbike1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pulsur1 p1=new Pulsur1();
		System.out.println("Enter price,colour, milage,brand,weight,name,model");
		int price=sc.nextInt();
		String colour=sc.next();
		String milage=sc.next();
		String brand=sc.next();
		int weight=sc.nextInt();
		String name=sc.next();
		String model=sc.next();
	
			
		p1.setModel(model);
		p1.setName(name);
		p1.setWeight(weight);
		p1.setBrand(brand);
		p1.setPrice(price);
		p1.setColour(colour);
		p1.setMilage(milage);
		
		
//		Bike1 b1=new Bike1();
//		b1.setBrand(brand);
//		b1.setPrice(price);
//		b1.setColour(colour);
//		b1.setMilage(milage);
		
		System.out.println(p1);
		//System.out.println(b1);
		p1.engine();
		
		p1.gears();
		
		p1.wheelNo();
		
		

	}

}
