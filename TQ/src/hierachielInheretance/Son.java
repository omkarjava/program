package hierachielInheretance;

public class Son extends Father {
	String education,sname;
	
	
	void sonDetail(String education,String sname)
	{
		this.education=education;
		this.sname=sname;
	}
	public void Display ()
	{
		super.Display();
	  System.out.println(education+" "+sname);
	
	}

}
