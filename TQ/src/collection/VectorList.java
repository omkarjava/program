package collection;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		 Vector<String> vec = new Vector<String>();  
		 vec.add("Tiger");  
         vec.add("Lion");  
         vec.add("Dog");  
         vec.add("Elephant"); 
         vec.add("Dog");  
         vec.add(null); 
         vec.add(null);  
         
         vec.remove(5);
         System.out.println(vec);

	}

}
