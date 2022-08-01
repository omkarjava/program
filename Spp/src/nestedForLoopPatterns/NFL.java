         package nestedForLoopPatterns;

        import java.util.Scanner;

        public class NFL {

	    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in)	;
		System.out.println("Enter  Number");
		int r =sc.nextInt();
		char ch='A';
		
		for(int i=1;i<=r;i++)
		{
			ch='A';
			for(int j=1;j<=i;j++)
			{     
				System.out.print(ch);
				ch++;
			}
			    System.out.println(); 
		}
		 System.out.println("Done"); 


	}

}
