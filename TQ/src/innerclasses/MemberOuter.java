package innerclasses;

public class MemberOuter {

	 static int a=10;
	 private int b=15;
	 int c=5;
	 class Inner
	 {
		 int a=105;
		 int c=59;
		 void display()
		 {
			 System.out.println("inner class");
			 System.out.println(a+" "+b+ " "+c);
			 System.out.println(MemberOuter.a);
			 System.out.println(MemberOuter.this.c);
		 }
	 }
	
	
	
	
	
	public static void main(String[] args) {
		MemberOuter.Inner inner=new MemberOuter(). new Inner();
		 	inner.display();
  
	}

}
