import java.util.Arrays;

public class EvenNoinoneArray {

	public static void main(String[] args) {
		int a[]= {5,8,9,7,9,4,9,3,5,8,9};
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				c++;
			}
		}
		int s[]=new int [c];
		int g=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				s[g]=a[i];
				g++;
			}
		}
		System.out.println(Arrays.toString(s));

	}

}
