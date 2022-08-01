package video1;

import java.util.Arrays;

public class Q15 {

	public static void main(String[] args) {
	
		
//		for(int i=0;i<5;i++)
//		{
//			for(int j=i;j<5;j++)
//			{
//				System.out.print(" ");
//			}
//			for(int k=i;k<5;k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
     
		int a[]= {4,5,2,1,6,8,7,9};
		int l=0;
		int sl=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>l)
			{
				sl=l;
				l=a[i];
			}
			else if(l>a[i])
			{
				sl=a[i];
			}
		}
		System.out.println(l);
		System.out.println(sl);
		
		
		
	}

}
