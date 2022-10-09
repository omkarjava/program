package febPaper;

import java.util.Set;
import java.util.TreeSet;
class A {
	String s = "Class A";
}

class B extends A {
	String s = "Class B";
	{
		System.out.println(super.s);
	}
}
class C extends B {
	String s = "Class C";

	{
		System.out.println(super.s + super.s);
	}
}

public class Question {
	
	
//	public static void changeColor(Car c1)
//	{
//	   c1.color = "Yellow";
//	}
//	}
//	class Car {
//	String name;
//	static String color = "White";




	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.s);

//		Car c1 = new Car();
//		c1.color = "Blue";
//		Car c2=new Car();
//		changeColor(c1);
//		c2.color=”Pink”;
//		System.out.println(c1.color);
//		System.out.println(c2.color);
		
		
//		Integer i = new Integer("200");
//		Integer j=i;
//		j=j+20;
//		Integer k = new Integer("220");
//		System.out.println(i+" "+k+" "+j);
//		System.out.println(i==j);
//		System.out.println(k==j);
		
//		int a[]={1, 1, 2, 2, 3, 4, 4, 5, 5};
//		
//		for(int i=0;i<a.length;i++)
//		{
//			int c=0;
//			for(int j=0;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				{
//					c++;
//				}
//			}
//			if(c==1)
//			{
//				System.out.println(a[i]);
//			}
//		}
//    
//		}
//		Set t = new TreeSet();
//		t.add("C++");
//		t.add("Spring");
//		t.add(new Car());
//		System.out.println(t);

	}
	
}

