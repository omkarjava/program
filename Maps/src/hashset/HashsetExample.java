package hashset;

import java.util.HashSet;

public class HashsetExample {
	
	static void average(HashSet<Integer>hs1)
	{
		int m=0;
		int add=0;
		for(Integer a:hs1)
		{
			add=add+a;
		    m++;
		}
		int s=add/m;
		System.out.println( " Average " + s );
		
	}
	
	
	
	

	public static void main(String[] args) {
		 
		HashSet<Integer>hs=new HashSet<>();
		hs.add(10);
		hs.add(15);
		hs.add(10);
		hs.add(18);
		hs.add(16);
		hs.add(11);
		hs.add(8);
		System.out.println(hs);
		HashSet<Integer>hs1=new HashSet<>();
		for(Integer h:hs)
		{
			if(!hs1.contains(h))
			{
				hs1.add(h);
			}
		}
		System.out.println(hs1);
		average(hs);
		
		
		

	}

}
