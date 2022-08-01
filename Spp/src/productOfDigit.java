        import java.util.Scanner;

        public class productOfDigit {

	    public static void main(String[] args) {
		int a,b=1;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your choice :");
		a=sc.nextInt();
		while(a!=0)
		{
		int r=a%10;
		    b=b*r;
		   a=a/10; 
		}
		System.out.println("Product of digit is :"+b); 
		}
        }  
	

    
