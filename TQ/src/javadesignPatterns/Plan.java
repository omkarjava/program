package javadesignPatterns;

public abstract class Plan {

	protected double rate;
	abstract void getRate();
	
	void generateBill(int units)
	{
		System.out.println("Total Bill is:"+(rate*units));
	}
	
	
	
}
