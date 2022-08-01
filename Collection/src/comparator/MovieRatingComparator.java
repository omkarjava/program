package comparator;

import java.util.Comparator;

public class MovieRatingComparator  implements Comparator<Movie>{
	
	public int compare(Movie s, Movie s1)
	{
		if(s.rating>s1.rating)
	  		return 1;
	  	    else if(s.rating<s1.rating)
	  		return -1;
	  	    else
	  	    	if(s.mid>s1.mid)
	  		  		return 1;
	  		  	    else if(s.mid<s1.mid)
	  		  		return -1;
		
			return s.mname.compareTo(s1.mname);
	}
	
	
	
	

	
}
