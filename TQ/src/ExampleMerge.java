import java.util.Arrays;

public class ExampleMerge {

	public static void main(String[] args) {
		int a[]= {5,4,7,8,};
		int a1[]= {2,4,3,8,1};
		int a3[]=new int[a.length+a1.length];
		
		for(int i=0;i<a1.length;i++)
		{
			a3[i]=a1[i];
		}
		for(int i=0;i<a3.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a3[i]==a[j])
				{
					break;
				}
				else
				{
					a3[a1.length-1+j]=a[j];
				}
			}
			
		}
		System.out.println(Arrays.toString(a)+" "+Arrays.toString(a1));
		System.out.println(Arrays.toString(a3));
		
	}

}
