package collection;

import java.util.ArrayList;

public class ArrayListAverage {

	public static void main(String[] args) {
		ArrayList <Float> a1=new ArrayList <>();
	    
		 a1.add(70.2f);
		 a1.add(75.2f);
		 a1.add(87.2f);
		 a1.add(96.2f);
		 a1.add(65.2f);
		 a1.add(55.2f);
		 
		System.out.println(a1); 
		float sum=0;
		int c=0;
		for(int i=0;i<a1.size();i++)
		{
			sum+=a1.get(i);
			c++;
		}
		Float f=sum/c;
		System.out.println(" Average Of Marks :"+f);  

	}

}
