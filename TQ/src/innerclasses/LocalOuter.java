package innerclasses;

public class LocalOuter {
	
	static int a=1000;
	private int b=200;
	
	void display()
	{
		class Inner
		{
			int a=20;
			void show()
			{
				System.out.println("inside local inner class");
				System.out.println(a);
				System.out.println(b);
				System.out.println(LocalOuter.a);
			}
		}
		Inner i=new Inner();
		i.show();
	}
	
public static void main(String[] args) {
	LocalOuter l=new LocalOuter();
	l.display();
}
}
