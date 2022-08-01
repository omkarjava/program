        package day5;

        import java.util.Scanner;

        public class nfloop {

	    public static void main(String[] args) {
		int x;
		Scanner sc= new Scanner (System.in)	;
		System.out.println("Enter Row Number");
		int r =sc.nextInt();
		
		for(int i=0;i<=r;i++)
		{
			for(int j=1;j<=i;j++)//
		{
			System.out.print(j);
		}
			for(int j=i-1;j>=i;j--)
			{
			  System.out.print( j );
			}
			for(int j=i;j<=i;j++)
			{
			  System.out.print( j );
			}
			System.out.println();
	     } 
         }
         }