        package day5;

        import java.util.Scanner;

        public class NFLDigits {

	    public static void main(String[] args) {
		int x;
		Scanner sc= new Scanner (System.in)	;
		System.out.println("Enter Row Number");
		int r =sc.nextInt();
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			    System.out.println(); 
		}
		 System.out.println("Done"); 


	 }

     }
