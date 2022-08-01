package comparator;

public class Movie {
	int mid,rating,collection;
	String mname;
	Movie (int mid,String mname,int rating,int collection)
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

	
}
