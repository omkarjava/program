import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<>();
		hm.put(13, null);
		hm.put(10, "ram");
		hm.put(15, "raj");
		hm.put(70, "ramesh");
		hm.put(12, "rahul");
		hm.put(85, "neha");
		hm.put(null, null);
		System.out.println(hm);

		LinkedHashMap<Integer,String>lm=new LinkedHashMap <>();
		
		lm.put(11, null);
		lm.put(10, "ram");
		lm.put(15, "raj");
		lm.put(70, "ramesh");
		lm.put(12, "rahul");
		lm.put(85, "neha");
		hm.put(null, null);
		System.out.println(lm);
		
		
		TreeMap<Integer,String>tm=new TreeMap<>();
		tm.put(18, null);
		tm.put(10, "ram");
		tm.put(15, "raj");
		tm.put(70, "ramesh");
		tm.put(12, "rahul");
		tm.put(85, "neha");
		hm.put(1, null);
		System.out.println(tm);
		

	}

}
