package dynamicDispatch;

   
public class FruitsMain {
	

	public static void main(String[] args) {
		Fruit f1=new Fruit();
		f1.eat();
		
		f1=new Apple ();//downcasting
		f1.eat();
	}

}
