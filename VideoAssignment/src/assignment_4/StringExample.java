package assignment_4;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
		 String  a[] = {"hi", "how", "are", "you", "doing"};
         int b;
		 for(int i=0;i<a.length;i++)
		 {
			 b=i;
			 for(int j=0;j<a.length;j++)
			 {
				 if(a[j].compareTo(a[b])>0)
			   {
					b=j; 
			   }
			 }
			 String s=a[i];
			 a[i]=a[b];
			 a[b]=s; 
		 }
		 System.out.println(Arrays.toString(a));
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
		 
	}

}
