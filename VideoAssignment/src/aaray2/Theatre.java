package aaray2;

import java.util.Arrays;

public class Theatre {
	
	int tid;
	String tname,location,movie;
	Movie m[];
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public Movie[] getM() {
		return m;
	}
	public void setM(Movie[] m) {
		this.m = m;
	}
	public String toString()
	{
		return tid+" "+tname+" "+location+" "+movie+" "+Arrays.toString(m);
	}
}
