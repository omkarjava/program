        package day3;

        import java.util.Scanner;

        public class smallerdigit {

	    public static void main(String[] args) {
		int a,r,smallb=9;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter your choice :");
		a=sc.nextInt();
		while(a>0)
		{
		r=a%10;
	
		if (smallb>r)
		{
		
		 smallb=r;
		}
		
		a=a/10;
		}
		System.out.println("small digit is :"+ smallb);
			
		}

	    }


	


