        package day3;

        import java.util.Scanner;

        public class higherdigit {

	    public static void main(String[] args) {
		int a,largeb=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your choice :");
		a=sc.nextInt();
		int b;
		while(a>0)
		{
		   b=a%10;
			
		   if (largeb<b)
		    {
		    largeb=b;
		    }
		a=a/10;
		//break;
		}
		System.out.println("large digit is :"+ largeb);
			
	    }
	    }

	    


