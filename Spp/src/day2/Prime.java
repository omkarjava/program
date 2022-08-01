        package day2;
        import java.util.Scanner;
        public class Prime {

	    public static void main(String[] args) {
	 	
		Scanner sc= new Scanner (System.in)	;
	    System.out.println("Enter your choice");
	    int  ch=sc.nextInt();
        int b=2;
        int mid=ch/2;
        while(b<=mid)
        {
           if(ch%b==0)
           
           b++;
           
           break;
           
        }
          if(b>mid)
          System.out.println("prime number");
          else
          System.out.println("not prime number");
	    }

	    }
        
