package practice;

import java.util.ArrayList;
import java.util.Collections;



public class Sorting_Car {
	
public static void main(String[] args) {
	ArrayList<Car> c =new ArrayList<>();
	c.add(new Car(100,"Swift","Maruti",900000,"white"));
	c.add(new Car(101,"Breeza","Maruti",1100000,"white"));
	c.add(new Car(102,"Baleno","Maruti",1100000,"white"));
	c.add(new Car(103,"Nexon","Tata",900000,"white"));
	c.add(new Car(104,"Punch","Tata",1000000,"white"));
	c.add(new Car(105,"Enduore","Ford",4500000,"Black"));
	c.add(new Car(106,"Figo","Ford",900000,"white"));
	c.add(new Car(107,"Etios","Toyota",900000,"white"));
	c.add(new Car(108,"Fortuner","Toyota",3500000,"white"));
	c.add(new Car(109,"Polo","Folkswagon",900000,"Red"));

	
	Collections.sort(c, new Comparator_Car ());
    System.out.println(c);
}

}
