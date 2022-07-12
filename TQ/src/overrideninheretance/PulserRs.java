package overrideninheretance;

public class PulserRs extends Pulser {
	String engine;
	int average;
	
	void pulserRs(String engine,int average)
	{
		this.engine=engine;
		this.average=average;
	}
	 void gears()
	 {
		 super.gears();
		 System.out.println("5 gears");
	 }
	public String toString()
	{
		return price+" "+colour+" "+type+" "+brand+" "+weight+" "+name+" "+model+" "+engine+" "+average;
	}

}
