import java.util.Arrays;

public class Swipe {

	public static void main(String[] args) {
		int a[]= {110,9,15,30,4};
		int length=a.length;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
//				if(a[i]>a[j])
//				{
//			    int b=a[i];
//			    a[i]=a[j];
//			    a[j]=b; 
//			     }
				if(i+1==a.length) 
				{
					break;
				}
				else
				a[i]=a[i+1];
				a[i+1]=a[i];
              
	     }
		}
		 System.out.println("Sorted Array:"+Arrays.toString(a));
		
		
		
	}

}
