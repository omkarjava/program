package string;

import java.util.Arrays;

public class StringDesc {

	public static void main(String[] args) {
		String  a[] = {"rahul", "prasad", "ajinkya", "sagar", "omkar"};
	  
		for(int i=0;i<a.length;i++)
		{
			int s=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					s=j;
				}
			}
			String d=a[i];
			a[i]=a[s];
			a[s]=d;
		}
      System.out.println(Arrays.toString(a));
	}

}
