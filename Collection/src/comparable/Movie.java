package comparable;

public class Movie implements Comparable<Movie>  {
	int mid,rating,collection;
	String mname;
	public Movie (int mid,String mname,int rating,int collection)
	{
		this.mid=mid;
		this.mname=mname;
		this.rating=rating;
		this.collection=collection;	
	}
	public String toString()
	{
		return mid+" "+mname+" "+rating+" "+collection;
	}
	public int compareTo(Movie e)
	  {
			if(this.rating>e.rating)
	  		    return 1;
	  	    else if(this.rating<e.rating)
	  		     return -1;
	  	    else
	  	    	if(this.mid>e.mid)
	  		  		return 1;
	  		  	else if(this.mid<e.mid)
	  		  		return -1;
//	  		  	else
//			    return this.mname.compareTo(e.mname);
	  		  	else
	  		  		return 0;
	  }
	
	

	public static void main(String[] args) {
		

	}

}
