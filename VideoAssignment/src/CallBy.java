
public class CallBy {
	//call by value
//	 int a=10;
//	 void add(int a)
//	 {
//		 a=a+10;
//		 //System.out.println(a);
//	 }
	// call by referance 
	 int a=10;
	 void add(CallBy c)
	 {
		 c.a=c.a+10;
		 //System.out.println(a);
	 }
	
	

	public static void main(String[] args) {
//	  CallBy c=new CallBy();
//	  c.add(c.a);
//      System.out.println(c.a);
       CallBy c=new CallBy();
       c.add(c);
       System.out.println(c.a);
      
	}

}
