package javadesignPatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ArrayListExample {

	public static void main(String[] args) {
//		ArrayList<Integer> al=new ArrayList<>();
//		al.add(100);
//		al.add(150);
//		al.add(125);
//		al.add(250);
		
		List<Integer> l =Arrays.asList(100,20,150,120,500);
		
		
//		
//		Consumer<Integer> print =(t)-> System.out.println(t);
//		l.forEach(print);
		

		Consumer<Integer> print =(t)-> System.out.println(t);
		l.forEach(print);
	}
	
	
}
