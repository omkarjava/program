package javadesignPatterns;

public class PlanInput {
	
	
	Plan getPlan(String name)
	{
		if(name==null)	
		{
			return null;
		}
		if(name.equalsIgnoreCase("domestic"))
		{
			return new Domestic();
		}
		else if(name.equalsIgnoreCase("commercial"))
		{
			return new Commercial();
		}
		else if(name.equalsIgnoreCase("Institutional"))
		{
			return new Institutional();
		}
		return null;
	}
	
	
	

}
