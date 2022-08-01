package overloading;

public class Double {
	
	 void series (double n)
	{
	double sum=0;
	for(double i=1;i<=n;i++)
	{
		double t=1/i;
		sum=sum+t;
	}
	System.out.println(sum);
	
//	double series ( double a ; double n1)
//	{
//		 sum=0;
//		double sum,total=0;b=1;
//		for(int i=1;i<=n1;i++)
//		{
//			
//		}
//		
//	}
//		
		
	}
	public static void main(String[] args) {
		Double d=new Double() ;
		d.series(5);
		
		
		
	}

}
