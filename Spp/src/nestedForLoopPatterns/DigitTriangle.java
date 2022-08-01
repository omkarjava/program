        package nestedForLoopPatterns;

        import java.util.Scanner;

        public class DigitTriangle {

	    public static void main(String[] args) {

		Scanner sc= new Scanner (System.in)	;
		System.out.println("Enter  Number");
		int r =sc.nextInt();
		
		for(int i=0;i<=r;i++)
		{
			
			for(int j=1;j<=r-i;j++)
			{
				System.out.print(" ");
				
			}
			for(int j=0;j<=i;j++)
			{
			  System.out.print( " "+ i );
			 
			}
			 System.out.println();
		}
		 System.out.println("Done"); 



	}

}
