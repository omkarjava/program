package override;

public class Kid extends Teenager  {
	
	
	
	void readBook()
	{
		super.readBook();
		System.out.println("read");
	}
	void readBook(int a)
	{
		System.out.println(a);
	}

	

}
