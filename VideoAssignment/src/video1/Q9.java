package video1;

public class Q9 {

	public static void main(String[] args) {
		int a=2,n=5;	
		int total=0;
		for(int i=1;i<=n;i++)
		{
			int b=1;
			int pow=0;
			for(int j=1;j<=b+1;j++)
			{
				pow=pow+a*(b+1);
			}
			int s=b/pow;
			total=total+s;
			
		}
		System.out.println(total);	
		
//		for(double i=0;i<n;i++)
//		{
//			total+=b/a*(b+1);
//			b+=3;
//		}
//		System.out.println("n series="+total);
		
		
	}

}
