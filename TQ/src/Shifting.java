import java.util.Arrays;

public class Shifting {

	public static void main(String[] args) 
	{
		int a[] = {10,15,55,69,64,45};
		
		int j=0;
		int k=a.length;
		int b;
		
		for(int i=0;i<k/2;i++)
		{
		     b=a[i];	
	     	a[i]=a[k-i-1];
	     	
		    a[k-i-1]=b;
      		//k--;
     		//j++;
		
		}
		System.out.print(Arrays.toString(a));
		
		//for(int i=0;i<a.length;i++)
		//{
			
		//}
		
		
	}

}
