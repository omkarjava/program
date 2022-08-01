package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Theater {
	
	int id,noOfmovies,collection;
	String name;
	
	Theater(int id,int noOfmovies,int collection,String name)
	{
	 this.id=id;
	 this.noOfmovies=noOfmovies;
	 this.collection=collection;
	 this.name=name;
	}
	
	public String toString()
	{
		return id+" "+noOfmovies+" "+collection+" "+name;
	}
	
	
	

	public static void main(String[] args) {
		ArrayList<Theater>te=new ArrayList<>();
		
		te.add(new Theater(12,3,220400,"inox"));
		te.add(new Theater(13,4,208000,"interzone"));
		te.add(new Theater(14,5,280000," citypride"));
		te.add(new Theater(15,2,208080,"laxminarayan"));
		
		Theater ai[]=new Theater [te.size()];
		te.toArray(ai);
		System.out.println("Object Array :"+Arrays.toString(ai));		
   
//		Theater ai[]=new Theater [te.size()];
//		for(int i=0;i<te.size();i++)
//		{
//			ai[i]=te.get(i);
//		}
//		System.out.println(Arrays.toString(ai));
		
		
		
		
		
		for(Theater t:ai)
		{
			if(t.name.startsWith("i"))
			{
				System.out.println(t.name+" "+t.collection);
			}
		}
		

	}

}
