package accessspecifiers;

public class Test2 extends Test1 {

	public static void main(String[] args) {
		Test1 T1=new Test1();
		System.out.println(T1.a);//default
		//System.out.println(T1.b); private
		System.out.println(T1.c);//protected
		System.out.println(T1.d);//public
		T1.Display();
		

	}

}
