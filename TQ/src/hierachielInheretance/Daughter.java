package hierachielInheretance;

public class Daughter extends Father{
	
	String dname,dedu ,gender;

	void daughterDetail(String gender,String dname,String dedu)
	{
		this.gender=gender;
		this.dname=dname;
		this.dedu=dedu;
	}
	public void Display()
	{
		super.Display();
		System.out.println(gender+" "+dname+" "+dedu);
	}
	

}
