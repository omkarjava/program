package innerclasses;

public class StaticOuter {
	
	static int a=100;
	
	int b=200;
	static class Inner
	{
		static int a=25;
		void display()
		{
			System.out.println("Inside Ineer Class"+a);
			System.out.println(StaticOuter.a);
			StaticOuter os=new StaticOuter();
			System.out.println(os.b);
			
		}
	}
	
	public static void main(String[] args) {
		StaticOuter.Inner obj= new 	StaticOuter.Inner ();
		obj.display();

	}

}
