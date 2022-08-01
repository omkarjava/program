package assignment_4;

import java.util.Arrays;

public class Arraycount {

	public static void main(StringExample[] args) {
		int a[]= {4,5,2,1,5,8,96,3,3,21,5,3};
		int c=a.length;
		int sum=0;
		int d=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			sum+=a[i];
			
			d=sum/c;
			
		}
       System.out.println(c);
	}

}
