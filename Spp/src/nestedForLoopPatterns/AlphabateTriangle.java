        package nestedForLoopPatterns;

        import java.util.Scanner;

        public class AlphabateTriangle {

	    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in)	;
		System.out.println("Enter  Number");
		int r =sc.nextInt();
		char ch='A';
		
		for(int i=1;i<=r;i++) //1//2//3
		{

		   for(int j=1;j<=r-i;j++)//5-1=4,3,2,1//5-2=3,2,1//5-3=2,1
		  {
		   System.out.print(" ");
				
		  }
		   ch='A';
		    for(int j=1;j<=i;j++)//a//ab//abc
		     {     
		      System.out.print(" "+ch);
		      ch++;
		     }
		   System.out.println(); 
		}
	}

    }
