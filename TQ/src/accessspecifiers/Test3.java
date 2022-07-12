package accessspecifiers;

public class Test3 {

	public static void main(String[] args) {
		
		Test1 T1=new Test1();
		System.out.println(T1.a);//Default
		//System.out.println(T1.b);//Private
		System.out.println(T1.c);//protected
		System.out.println(T1.d);//public
		T1.Display();
	}

}
