package overloading;

public class SeriesDouble {
	
	void series(double a,double n)
	{
		int sum ,total=0,b=1;
		for(int i=1;i<=n;i++)
		{
			sum=1;
			for(int j=1;j<=b+1;j++)
			{
				sum*=a;
			}
			total=total+b/sum;
			b+=3;
		}
		for(double i=0;i<n;i++)
		{
			total+=b/a*(b+1);
			b+=3;
		}
		System.out.println("n series="+total);
		
		
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		SeriesDouble s=new SeriesDouble();
		s.series(2, 5);
	}

}
