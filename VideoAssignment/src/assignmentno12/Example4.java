package assignmentno12;

import java.util.LinkedList;

public class Example4 {

	public static void main(String[] args) {
		LinkedList<Integer>l=new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(11);
		ll.add(22);
		ll.add(33);
		ll.add(44);
		
		LinkedList<Integer>lll=new LinkedList<>();
		
		for(int i=0;i<l.size();i++)
		{
			lll.add(l.get(i));
			if(i<ll.size())
			{
				lll.add(ll.get(i));
			}
	
		}
		System.out.println(lll);
		
		
	}

}
