    package constructorAssi;
    import java.util.Scanner;
    public class PPattern3 {

	public static void main(String[] args) {
	int i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The No:");
	int r=sc.nextInt();
	for(i=r;i>=1;i--)
	{   
		for( j=i-1;j>=1;j--)
		{
			System.out.print( " " );
		}
	
		for(j=i;j<=r;j++)
		{
			System.out.print( j );
			
		}
	    for(j=r-1;j>=i;j--)
		{
		System.out.print( j );
		}
	        System.out.println();
	}

	}

}
