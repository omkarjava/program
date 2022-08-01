package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainTheater {

	public static void main(String[] args) {
		ArrayList<Theater>t=new ArrayList<>();
		  
		   Scanner sc=new Scanner(System.in);
		   System.out.println("No of Theaters");
		   int a=sc.nextInt();
		   for(int i=0;i<a;i++)
		   {
			 System.out.println("Theater id + name");
	       	   int id=sc.nextInt();
	        	String name=sc.next();
	       	 ArrayList<Movie> m=new ArrayList<>();
	        	for(int j=0;j<3;j++)
	    	   {
	    		System.out.println("Movie  mid + mname + rating + collection ");
	    		int mid=sc.nextInt();
	        	String mname=sc.next();
	    		int rating=sc.nextInt();
	    		int collection=sc.nextInt();
	    		m.add(new Movie(mid,mname,rating,collection));
	    		 Collections.sort(m);
	    		// System.out.println(m);
	    	    }
	       	
	       	t.add(new Theater(id,name,m));
	       	
		   }
		  
		  System.out.println(t);
		  

	}

}
