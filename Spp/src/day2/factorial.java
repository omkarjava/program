      package day2;

      import java.util.Scanner;

      public class factorial {

	  public static void main(String[] args) {
		
	  Scanner sc= new Scanner (System.in)	;
	  System.out.println("Enter your choice:");
	  int  choice=sc.nextInt();
	  int i=1,fact=1;
			
      while(i<=choice )
    	{

	  fact=fact*i;
	   i++;
				
	  }
      System.out.println("factorial of number:"+fact);
				
	  }
		 
	        

	  }


