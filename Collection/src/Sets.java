import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;


public class Sets {

	public static void main(String[] args) {
		Integer[]a= {22,45,33,66,55,34,77};
		Integer[]b= {33,2,83,45,3,12,55};
		HashSet<Integer>s1=new HashSet<>();
        
		s1.addAll(Arrays.asList(a));
		
		HashSet<Integer>s2=new HashSet<>();
		
		s2.addAll(Arrays.asList(b));
		
		
		// finding union of s1 and s2
		
		HashSet<Integer>u=new HashSet<>(s1);
		u.addAll(s2);
		System.out.println(u);
		
		// finding intersection of s1 and s2
		
		
		HashSet<Integer>i=new HashSet<>(s1);
		i.retainAll(s2);
		System.out.println(i);
		
		// fiding difference of s1 and s2
		HashSet<Integer>d=new HashSet<>(s1);
		d.removeAll(s2);
		System.out.println(d);
		System.out.println();
		
		
		
		HashSet<Integer>s=new HashSet<>();
		s.add(2);
		s.add(20);
		s.add(12);
		s.add(72);
		s.add(null);
		s.add(null);
		s.add(null);
		System.out.println(s);
		LinkedHashSet<Integer>l=new LinkedHashSet<>();
		
		l.add(2);
		l.add(20);
		l.add(12);
		l.add(72);
		l.add(null);
		l.add(null);
		System.out.println(l);
		TreeSet<Integer>t=new TreeSet<>();
		t.add(2);
		t.add(20);
		t.add(12);
		t.add(72);
		//t.add(null);
		
		System.out.println(t);
		System.out.println();
		ArrayList<Integer>al=new ArrayList<>();
		al.add(null);
		al.add(20);
		al.add(2);
		al.add(72);
		al.add(null);
		System.out.println(al);
		LinkedList<Integer>ll=new LinkedList<>();
		al.add(null);
		ll.add(72);
		ll.add(2);
		ll.add(20);
		ll.add(null);
		ll.add(null);
		System.out.println(ll);

		
	}

}
