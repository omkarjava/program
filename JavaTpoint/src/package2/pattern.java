package package2;

public class pattern {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<=i-1;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=i;k++)
			{
				System.out.print("*");
			}
		}

	}

}
