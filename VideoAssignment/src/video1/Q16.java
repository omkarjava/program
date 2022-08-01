package video1;

import java.util.Arrays;

public class Q16 {

	public static void main(String[] args) {
		int a[]= {4,5,2,1,5,7,8,9,6};
//		for(int i=0;i<2;i++)
//		{
//			int j, c=a[0];
//			for( j=0;j<a.length-1;j++)
//			{
//				a[j]=a[j+1];
//			}
//			a[j]=c;
//		}
//       System.out.println(Arrays.toString(a));
		
		
		for(int i=0;i<1;i++)
		{
			int j, c=a[0];
			for( j=0;j<8;j++)
			{
				a[j]=a[j+1];
			}
			a[j]=c;
		}
		System.out.println(Arrays.toString(a));
		
		
	}

}
