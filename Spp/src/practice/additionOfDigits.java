    package practice;
    import java.util.Scanner;
    public class additionOfDigits {
    	int sum (int number)
    	{ int a=1,b=0;
    		while(number>0) 
    		{
    			int r ;
    			r=number%10;
    			b=b+r;
    			number=number/10;
    		}
    		return b;
    	}

	public static void main(String[] args) {	
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the Number");
     int number=sc.nextInt();
     additionOfDigits a1= new additionOfDigits();
    // int add =a1.sum( number);
    // System.out.println(add);
     System.out.println(a1.sum( number));
	}

}
