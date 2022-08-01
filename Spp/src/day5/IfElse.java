        package day5;

        import java.util.Scanner;

        public class IfElse {

	    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in)	;
	    System.out.println("Enter your choice");
	    int  choice=sc.nextInt();
	    
	    if(choice%8==0)
	    System.out.println("Enter No Is Divisible");	
	    else	
	    System.out.println("Enter No Is Not Divisible");	
	    }

        }
