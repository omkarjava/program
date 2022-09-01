package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class Car_ArrayList {

	
	public static void main(String[] args) {
		
		ArrayList<Car> c =new ArrayList<>();
		c.add(new Car(100,"Swift","Maruti",900000,"white"));
		c.add(new Car(101,"Breeza","Maruti",1100000,"white"));
		c.add(new Car(102,"Baleno","Maruti",1000000,"white"));
		c.add(new Car(103,"Nexon","Tata",900000,"white"));
		c.add(new Car(104,"Punch","Tata",1000000,"white"));
		c.add(new Car(105,"Enduore","Ford",4500000,"Black"));
		c.add(new Car(106,"Figo","Ford",900000,"white"));
		c.add(new Car(107,"Etios","Toyota",900000,"white"));
		c.add(new Car(108,"Fortuner","Toyota",3500000,"white"));
		c.add(new Car(109,"Polo","Folkswagon",900000,"Red"));
		
		System.out.println(c);
		
		HashMap<String,Integer> m=new HashMap<>();
		
		for(Car x:c)
		{
			if(m.containsKey(x.brand))
			{
				int v=m.get(x.brand)+1;
				m.put(x.brand,v);
			}
			else
			{
				m.put(x.brand, 1);
			}
		}
		
		System.out.println(m);
		
	}
}
