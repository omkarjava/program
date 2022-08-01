package loop;

public class p1 {

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
				System.out.print(" "+j);
			}
			System.out.println();
		
		
		for(int m=r-1;m>=1;m--)
		{
			for(int j=r;j<=r-i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=r;k++)
			{
				System.out.print(" "+k);
			}
			System.out.println();
		}

	}}

}
