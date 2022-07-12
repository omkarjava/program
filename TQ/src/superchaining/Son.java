package superchaining;

public class Son extends Father
    {
	
	String sonname;
	void sonName(String sonname)
	{
		this.sonname=sonname;
	}
	void display(String fname,String sname)
	{
		
		System.out.println(sonname+" "+fname+" "+sname);
	}

}
