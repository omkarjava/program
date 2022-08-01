package aaray2;

public class Movie {
	int Movieid;
	String Moviename, Rating;
	public int getMovieid() {
		return Movieid;
	}
	public void setMovieid(int movieid) {
		Movieid = movieid;
	}
	public String getMoviename() {
		return Moviename;
	}
	public void setMoviename(String moviename) {
		Moviename = moviename;
	}
	public String getRating() {
		return Rating;
	}
	public void setRating(String rating) {
		Rating = rating;
	}
   public String toString()
{
	return Movieid+" "+Moviename+" "+ Rating;
}
}
