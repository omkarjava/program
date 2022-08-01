
public class Array {

	public static void main(String[] args) {
		int a[]= {110,9,15,30,4};

		int max=0;
		int min=110;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		} 
		System.out.println(max);
		System.out.println(min);
	}

}
