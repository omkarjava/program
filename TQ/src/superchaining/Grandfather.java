package superchaining;

public class Grandfather
    {
	
	String name;
	String mname;
	String sname;
	  
	void grandFather(String name,String mname,String sname)
	{
		this.name=name;
		this.mname=mname;
		this.sname=sname;
	}
	void display()
	{
		System.out.println(name+" "+mname+" "+sname);
	}
	

}
