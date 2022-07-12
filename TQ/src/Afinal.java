 /*final*/ class Afinal {//cannot be subclass and inhereted
  
	/*final*/ int c=10;//constant
	/*final*/ void display()//child class cannot override final class method
	{
		System.out.println("A");
	}

	
} 
class B extends Afinal
{
	int c=10;
	void display()
	{
		System.out.println("A");
	}
}
