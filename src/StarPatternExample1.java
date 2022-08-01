import java.util.Scanner;

public class StarPatternExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r; //4
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row number: ");
		r=sc.nextInt();
		
		for(int i=1;i<=r;i++) //     i=2
		{
			for(int k=1;k<=r-i;k++)//k=1 k=2
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) // j=2
			{
				System.out.print("* "); //___*
			}                           //__**
			System.out.println();       //_***
		}                               //****
		
		/*for(int i=r;i>=1;i--)
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("* "); 
			}                          
			System.out.println();
		}*/
		
		System.out.println("Done");
                                       //
	}

}
