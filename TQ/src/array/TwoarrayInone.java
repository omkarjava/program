package array;

public class TwoarrayInone {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {7,8,9,4,5};
		int k=a.length;
		int h=b.length;
		int g=h+k;
		int c[]= new int[g];

		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			
		}
		
		for(int j=0;j<b.length;j++)
		{
			c[a.length+j]=b[j];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
