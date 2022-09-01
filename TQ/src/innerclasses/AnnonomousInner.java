package innerclasses;

abstract class person
{
	abstract void display();
}

interface A
{
	void show();
}

public class AnnonomousInner {

	public static void main(String[] args) {
		person p=new person()
				{
			      String a="abc";
			      void display()
			      {
			    	  System.out.println("Inside Annonomous inner class");
			    	  System.out.println(a);
			      }
				};
				p.display();
		A a=new A()
				{
			       public void show()
			       {
			    	   System.out.println("interfase overriden method");
			       }
				};
				a.show();

	}

}
