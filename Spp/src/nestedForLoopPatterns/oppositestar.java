         package nestedForLoopPatterns;

        import java.util.Scanner;

        public class oppositestar {

	    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in)	;
		System.out.println("Enter  Number");
		int r =sc.nextInt();
		
		
		for(int i=r-1;i>=0;i--)
		{

			for(int j=1;j<=r-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			    System.out.println(); 
		}
		 System.out.println("Done"); 


	}

}
