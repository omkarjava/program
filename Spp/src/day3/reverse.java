        package day3;

        import java.util.Scanner;

        public class reverse {

	    public static void main(String[] args) {
		
		int a,b=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your choice :");
		a=sc.nextInt();
		while(a!=0)
		{
		int r=a%10;
		b=b*10+r;
		a=a/10; 
		}
		System.out.println("reverse the r :"+b); 
		}
         

	    }


