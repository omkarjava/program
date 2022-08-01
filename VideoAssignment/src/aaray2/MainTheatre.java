package aaray2;

import java.util.Arrays;

public class MainTheatre {

	public static void main(String[] args) {
		Theatre t[]=new Theatre[1];
		for(int i=0;i<=0;i++)
		{
			Movie m[]=new Movie[1];
		  for(int j=0;j<=0;j++)	
		  {
			  Movie m1=new Movie();  
			  m1.setMovieid(12);
			  m1.setMoviename("chandra");
			  m1.setRating("A");
			  m[j]=m1;
		  }
			
		Theatre t1=new Theatre();	
		t1.setTid(1);	
		t1.setLocation("pune");	
		t1.setTname("Citypride");	
		t1.setM(m);
			
			t[i]=t1;
			
		}
		System.out.println(Arrays.toString(t));

	}

}
