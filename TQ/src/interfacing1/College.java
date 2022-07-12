package interfacing1;

public interface College {
	
	void uniform();
	void id();
	void transport();
	default void library()
	{
		System.out.println("membership mandotary");
	}
//	public void accob() //java 1.9 its available
//	{
//		System.out.println("no");
//	}
	static void lab()
	{
		System.out.println("compulsary");
	}
}
