package linklistAssignment;

import java.util.LinkedList;

public class Example3 {

	public static void main(String[] args) {
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(20);
		ll.add(12);
		ll.add(22);
		ll.add(122);
		ll.add(10);
		ll.add(129);
		ll.add(10);
		ll.add(21);
		ll.add(20);
		ll.add(12);
		ll.add(22);
		ll.add(122);
		ll.add(10);
		ll.add(129);
		ll.add(10);
		ll.add(21);
		System.out.println(ll); 
		for(int i=0;i<ll.size();i++)
		{
		  int c=0;
		  for(int j=0;j<ll.size();j++)
		  {
			  if(ll.get(i)==ll.get(j)&&j<i)
			  {
				  break;
			  }
			  else if(ll.get(i)==ll.get(j)&&j>=i)
			  {
				  if(c<j)
				  {
					 c=j; 
				  }
			  }
		  }
		 
		  if(c!=0)
		  {
			  System.out.println(ll.get(i)+"="+c);
		  }
		 	
			
		}

	}

}
