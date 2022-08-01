        package practice;

        public class p1 {

	    public static void main(String[] args) {
		int i,j,a;
		int r=5;
		for (i=r-1;i>=0;i--)
		{
	    for(a=1;a<=r-i;a++)
	    {
	    System.out.print(" ");
	    
	    }
		for(j=0;j<=i;j++)
		{
		System.out.print(j+  " " );
		}
		System.out.println();
		}
		for(i=r+1;i<=1;i++)
		{
		for( j=1;j<=r+i;j++)
		{
			System.out.print(" ");
		}
		for(a=1;a<=i;a++)
		{
			System.out.print(a);
		}
		System.out.println();
		}
	}

}
