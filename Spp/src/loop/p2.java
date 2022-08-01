package loop;

public class p2 {

	public static void main(String[] args) {
		int h=5;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=h-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+k);
			}
			System.out.println();
		}
		for(int i=h-1;i>=1;i--)
		{
			for(int j=1;j<=h-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+k);
			}
			
			System.out.println();
		}
	}

}
