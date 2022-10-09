package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class SortingArrayList {

	public static void main(String[] args) {
		 ArrayList<Integer>al=new ArrayList<>();
		 
		 al.add(56);
		 al.add(50);
		 al.add(46);
		 al.add(86);
		 al.add(76);
		 al.add(36);
		 al.add(96);
		 
		Iterator it=al.iterator();
		for(int i=0;i<al.size();i++)
		{
			for(int j=0;j<al.size();j++)
			{
				if(al.get(i)<al.get(j))
				{
					int a=al.get(i);
				   al.set(i, al.get(j));
					al.set(j, a);
					
				}
			}
		}
		System.out.println(al);
	}

}
