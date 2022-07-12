package superchaining;

public class Father extends Grandfather
    {
	
	String fname;
	 
	void fatherName(String fname)
	{
		this.fname=fname;
	}
	void display(String name,String sname)
	{
			System.out.println(fname+" "+name+" "+sname);
	}

}
