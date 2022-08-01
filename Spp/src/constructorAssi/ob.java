    package constructorAssi;

    public class ob {
	int a,b;
	String name;
	public static String colgname1;
	ob ()
	{
		
	}
	static void colgname1()
	{
		String colgname= "ram";
		System.out.println("name1;" + colgname );
		
	}
	void display()
	{
		System.out.println("name:"+name);
	}

	public static void main(String[] args) {
		   ob s=new ob();
		   s.display();
	

	}

}
