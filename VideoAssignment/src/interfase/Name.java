package interfase;

public interface Name {
	
	
	
	public void data();
	default void set()
	{
		System.out.println("default keyworld");
	}
	static void setdata()
	{
		System.out.println("static keyworld");
	}
	 
}
