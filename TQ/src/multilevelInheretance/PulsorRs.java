package multilevelInheretance;

public class PulsorRs extends Pulsor {
	String engine;
	int average;
	
	void pulsorRs(String engine,int average)
	{
		this.engine=engine;
		this.average=average;
	}
	public String toString()
	{
		return price+" "+colour+" "+type+" "+brand+" "+weight+" "+name+" "+model+" "+engine+" "+average;
	}

}
