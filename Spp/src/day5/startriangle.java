        package day5;

        import java.util.Scanner;

        public class startriangle {

	    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in)	;
		System.out.println("Enter Row Number");
		int n =sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{ 
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
		for(int r=0;r<=i;r++);
		{
			System.out.print(" *");
		}
		System.out.println();
	    }
	    }
        }
