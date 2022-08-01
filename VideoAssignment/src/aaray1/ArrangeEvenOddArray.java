     package aaray1;
 
     import java.util.Arrays;

     public class ArrangeEvenOddArray {

	 public static void main(String[] args) {
     int a[]= {2,3,5,4,9,6,7,10,8,6,3};
		
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]%2==0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
