package assignmentno12;

import java.util.LinkedList;

public class Example3 {

	public static void main(String[] args) {
		LinkedList<Integer>l=new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		
		for(Integer a:l)
		{
			if(a%2!=0)
			{
				System.out.print(a+" ");
			}
		}
		
		
		
	}

}
