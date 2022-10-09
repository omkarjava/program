package example;

public class Course {
	
	int id;
	String cname;
	
	Course(int id,String cname)
	{
		this.id=id;
		this.cname=cname;
	}
 public String toString()
 {
	 return id+" "+cname;
 }
}
