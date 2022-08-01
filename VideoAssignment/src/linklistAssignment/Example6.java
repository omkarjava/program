    package linklistAssignment;

    import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

    public class Example6 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(10, "ram");
		hm.put(12, "sachin");
		hm.put(11, "gaurav");
		hm.put(19, "rakesh");
		hm.put(18, "vaibhav");
		hm.put(20, "anand");
		hm.put(98, "Avi");
		hm.put(25, "jay");
		hm.put(13, "avanti");
		hm.put(8, "Avi");
		System.out.println(hm.keySet());
	
		
		
		Set s=new LinkedHashSet();
		s.add("1");
		s.add(1);
		s.add(3);
		s.add(2);
		System.out.println(s);
		
		
		
		
		
		
	}

}
