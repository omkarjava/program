     package arrayListToArray;

     import java.util.ArrayList;
     import java.util.Collections;

     public class CollectionsMethods {

	 public static void main(String[] args) {
     ArrayList<Integer>al=new ArrayList<>();
     ArrayList<Integer>al1=new ArrayList<>();
        al1.add(15);
		al1.add(25);
		al1.add(45);
     
     
     
     
		al.add(15);
		al.add(25);
		al.add(45);
		al.add(85);
		al.add(55);
		al.add(95);
		al.add(85);
		al.add(35);
		al.add(16);
		al.add(18);
		System.out.println(al);
		
		Collections.sort(al);// ascending order
		System.out.println(al);
		
		System.out.println(Collections.frequency(al, 85));
		System.out.println(Collections.indexOfSubList(al, al1));
		
		
		
		
	}

}
