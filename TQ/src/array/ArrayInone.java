package array;

public class ArrayInone {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,5};
		int b[]= {7,8,9,4,5,23};
		int k=a.length;
		int h=b.length;
		int m=k+h;
		int c[]= new int [m];

		for(int i=0;i<c.length;i++)
		{
			c[0]=a[0];
			c[1]=b[0];
			c[2]=a[1];
			c[3]=b[1];
			c[4]=a[2];
			c[5]=b[2];
			c[6]=a[3];
			c[7]=b[3];
			c[9]=b[0];
			c[10]=a[0];
			
			
		}
		for(int j=0;j<c.length;j++)
		{
			System.out.print(c[j]);
		}
		
		
		
		
		
		
		
	}

}
