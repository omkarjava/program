package example;

public class SecondHighest {

	public static void main(String[] args) {
		int a[]= {5,8,7,8,58,6,6,3};

		int s=0;
		int f=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>s)
			{
				f=s;
				s=a[i];
			}
			else if(a[i]>f)
			{
				f=a[i];
			}
		}
		System.out.println(s);
		System.out.println(f);
		
	}

}
