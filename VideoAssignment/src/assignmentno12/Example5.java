package assignmentno12;

import java.util.Arrays;

public class Example5 {

	public static void main(String[] args) {
		
        for(int i=5;i>=0;i--)
        {
        	for(int j=i;j<5-i;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int k=0;k<=i;k++)
        	{
        		System.out.print( "   *  ");
        	}
        	System.out.println();
        }
		
		int a[]= {1,4,5,2,3,4,6,6,8};
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a.length;j++)
			 {
				 if(a[i]<a[j])
				 {
					 int s=a[i];
					 a[i]=a[j];
					 a[j]=s;
							 
				 }
			 }
		 }
		 System.out.println(Arrays.toString(a) );
		
		
		 
	}

}
