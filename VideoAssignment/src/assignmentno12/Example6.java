package assignmentno12;

import java.util.Arrays;

public class Example6 {

	public static void main(String[] args) {
		   String s="omkar";
		  char c[]=s.toCharArray();
		  
			for(int i=c.length-1;i>=0;i--)
			{
				System.out.println(c[i]);
			}
			 
			int a[]= {1,4,5,2,3,4,6,6,8};
			
			for(int i=0;i<2;i++)
			{
				int t=a[i];
				a[i]=a[i+7];
				a[i+7]=t;
				
			}
			System.out.println(Arrays.toString(a));
			
			
			
	}

}
