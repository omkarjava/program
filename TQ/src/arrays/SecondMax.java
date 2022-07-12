    package arrays;

import java.util.Arrays;

public class SecondMax {
	public static void main(String[] args) {
		int a[]= {20,0,31,45,100,1,105,90};
		int b=a.length;
		int max=105;
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=i+1;j<a.length;j++)
    	   {
    		   if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}  
    	   }
    		  
       }
       System.out.println("Sorted Array:"+Arrays.toString(a)); 
       System.out.println("Second Max:"+a[1]);
	}

}
