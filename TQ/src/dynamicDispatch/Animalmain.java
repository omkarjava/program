package dynamicDispatch;

 class Animal
{
	void get()
	{
		System.out.println("Animal ia lovely");
	}
}
 class Dog extends Animal
 {
	 void get()
		{
			System.out.println(" Dog ");
		} 
 }
 class Cat extends Animal
 {
	 void get()
		{
			System.out.println("Cat");
		} 
 }


public class Animalmain 
{

	    public static void main(String[] args) 
	    {
	
		Animal a=new Animal();
		a.get();
		
		a=new Dog();
		a.get();
		
		a=new Cat();
		a.get();

	}

}
