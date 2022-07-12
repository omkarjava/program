package interfacing1;

public interface Company extends Car {
	
	void price();
	void colours();
	void models();
    static void name()
    {
    	System.out.println("tata");
    }
	
}
