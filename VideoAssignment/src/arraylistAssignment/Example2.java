package arraylistAssignment;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();

		al.add("sunday");
		al.add("monday");
		al.add("tuesday");
		al.add("thursday");
		al.add("wensday");
		al.add("saturday");
		al.add("friday");
	
		for(int i=0;i<al.size();i++)
		{
			int s=0;
			for(int j=0;j<al.get(i).length();j++)
		    {
				s++;
				
			}
			if(s>7)
			{
			 al.remove(i);
			}
			
//			if(s>0)
//			{
//				System.out.println(al.get(i)+"="+s);
//			}
				
		}
		
		System.out.println(al);
		
		
		
		
		
		
		
	}

}
