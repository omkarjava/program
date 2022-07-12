package interfacing1;

class A
{
	public void display()
	{
		System.out.println("parent");
	}
}
interface ABC
{
	void show();
	void display();
	
}

public class Classinterface extends A implements ABC {
	
	
	public void display()
	{
		System.out.println("child");
	}
	public void show()
	{
		System.out.println("vjh");
	}

	public static void main(String[] args) {
		Classinterface c=new Classinterface();
		 c.display();
         c.show();
	}

}
