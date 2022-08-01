    package day4;

    public class forloop {

	public static void main(String[] args) {
	int r=5,a;
	for(int i=1;i<=r;i++)
	{
		for(a=1;a<r-i;a++)
		{
			System.out.print(  " ");
		}
			
		for(int j=1;j<=i;j++)
		{
			System.out.print(   " * ");
		}
		System.out.println();
	}
	System.out.println("done");

	}

}
