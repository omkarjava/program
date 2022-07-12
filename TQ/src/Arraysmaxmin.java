
public class Arraysmaxmin {

	public static void main(String[] args) {
		int a[]= {5,8,7,9,5,12,3,3,65,4};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		
		}
		System.out.println(max);
	    int min=4;
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		
		}
		System.out.println(min);
	    

	}

}
