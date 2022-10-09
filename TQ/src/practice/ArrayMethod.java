    package practice;

    public class ArrayMethod {
	
	void method(int a[])
	{
	 
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==8)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		ArrayMethod a=new ArrayMethod();
		int s[]= {1,2,4,5,6,3,2,4,5,2};
		a.method(s);

	}

}
