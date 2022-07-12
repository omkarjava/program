import java.util.Arrays;

public class SwipeArray {

	public static void main(String[] args) {
		int a[]= {110,9,15,30,4};
		for(int i=0;i<=0;i++)
		{
			int j;
			int s=a[0];
			for( j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[j]=s;
		}
		System.out.println(Arrays.toString(a));

	}

}
