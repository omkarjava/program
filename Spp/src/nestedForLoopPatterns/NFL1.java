        package nestedForLoopPatterns;

        import java.util.Scanner;

        public class NFL1 {

	    public static void main(String[] args) {

		Scanner sc= new Scanner (System.in)	;
		System.out.println("Enter  Number");
		int r =sc.nextInt();	
		for(int i=0;i<=r;i++)
		  {
		  System.out.print(" *");
		  for(int j=1;j<=i;j++)
		  {
		  System.out.print(j+ " ");		
		  }
		  for(int j=i-1;j>=1;j--)
		  {
		  System.out.print(j+" ");
		  }
		System.out.print("*");
		System.out.println();
        }
	
	    }
        }
        
        
	
	    


