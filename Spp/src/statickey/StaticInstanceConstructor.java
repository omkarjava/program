    package statickey;

    public class StaticInstanceConstructor {
	int id,salary;
	String name;
	{  
		
		id=1;
		name="sv";
		salary=500;
		System.out.println( id+" " + name+" " + salary);
	}
	static 
	{
	 	String colgname = "kj";
	 	System.out.println("collegename:"+colgname);
		
	}
	{
	System.out.println("block2");
	}
	public StaticInstanceConstructor()
	{
		System.out.println("constructor");
	}
	

	public static void main(String[] args) {
		StaticInstanceConstructor c=new StaticInstanceConstructor();
	
		

	}

}
