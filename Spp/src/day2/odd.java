    package day2;

    import java.util.Scanner;

    public class odd {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in)	;
	    System.out.println("Enter your choice");
	    int  choice=sc.nextInt();
		int i=121;
    while (i<=choice) 
    {
    	i=i+2;
    	System.out.println("odd number"+i);
    	 
    }
	}

    }
