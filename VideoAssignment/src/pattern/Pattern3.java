package pattern;

public class Pattern3 {

	public static void main(String[] args) {
		int r=5;
		for(int i=1;i<=r;i++)
		{ 
			
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{ 
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{ 
			
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{ 
				System.out.print("*");
				
			}
			System.out.println();
		}
		

	}

}
