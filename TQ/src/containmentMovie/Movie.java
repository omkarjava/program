package containmentMovie;

import java.util.Arrays;

public class Movie {
	
	int mid;
	String mname;
	int collection;
	Actor ac[];
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getCollection() {
		return collection;
	}
	public void setCollection(int collection) {
		this.collection = collection;
	}
	public Actor[] getAc() {
		return ac;
	}
	public void setAc(Actor[] ac) {
		this.ac = ac;
	}
	public String toString()
	{
		return mid+" "+mname+" "+collection+" "+Arrays.toString(ac);
	}

}
