package assignment_4;

//public class Account {
//	long accno;
//	String name;
////	 void account()
////	{
////		
////		System.out.println("default Constructor");
////	}
////	Account(int a)
////	{
////		this.account();
////		System.out.println(a);
////	}
////	public int getData(int a)
////	{
////	return 0;
////	}
////	public long getData()
////	{
////	return 1;
////	}
//	
//	
//	
//	
//class X
//{
//public X(int i)
//{
//System.out.println(1);
//}
//}
//class Y extends X
//{
//public vidY()
//{
//System.out.println(2);
//}
	//public static void main(String[] args) {
//		Account a=new Account();
//		System.out.println(a.getData(5));

	//}

//}
class Base {
public final void show() {
System.out.println("Base::show() called");
}
}
class Derived extends Base {
public void hshow() {
System.out.println("Derived::show() called");
}
}
 class Main {
public static void main(StringExample[] args) {
Base b = new Derived();;
b.show();
}
}
