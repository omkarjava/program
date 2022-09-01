package javadesignPatterns;

public class LambadaExample {

	public static void main(String[] args) {
//		Addition a=()->System.out.println("In Addition Method Of Interface");
//		
//		a.add();
		
//		Addition a=()->{
//			int c=8,d=6;
//			System.out.println("Addition is:"+(c+d));
//		};
//		a.add();
		
//		Addition a=(t)->{
//			
//		    System.out.println("Square is:"+(t*t));
//	                   };
//          a.square(6);
          
		
//		Addition a=(t,k)->{
//			
//		    System.out.println("Full Name is:"+(t+" "+k));
//	                   };
//           
//          a.fullName("omkar", "Phadatare");
          
             Addition a=(t,k)->{
            	 
			char s=k.charAt(0);
		     System.out.println("Full Name is:"+(t+" "+s));
	                   };
           a.fullName("omkar", "Phadatare");
		
		
	}

}
