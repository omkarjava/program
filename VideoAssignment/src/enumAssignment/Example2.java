package enumAssignment;

public class Example2 {

	public static void main(String[] args) {
	   Seasons s=Seasons.AUTUMN;
	   
	   
	   
	   
	   switch(s)
	   {
	   case SPRING:
		   System.out.println("spring");
		   break;
	   case SUMMER:
		   System.out.println("summer");
		   break;
	   case AUTUMN:
		   System.out.println("autumn");
           break;
       default:
    	   System.out.println("none");
           
           
	   }

	}

}
