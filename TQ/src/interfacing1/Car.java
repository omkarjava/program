package interfacing1;

public interface Car {
	
	void wheels();
	void gears();
	default void id()
	{
		System.out.println("5");
	}

}
