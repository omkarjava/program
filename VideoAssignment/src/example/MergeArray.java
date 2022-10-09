package example;

import java.util.HashSet;

public class MergeArray {

	public static void main(String[] args) {
		int a[]= {5,6,2,4,56,33,1};
		int b[]= {2,2,4,5,3,2,1,4,56,3};
		HashSet<Integer>hs=new HashSet<>();
//		for(int i=0;i<b.length;i++)
//		{
//			
//			hs.add(b[i]);
//		}
//		System.out.println();
//		for(int i=0;i<a.length;i++)
//		{
//			
//			hs.add(a[i]);
//		}
//		System.out.println(hs);
//		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
			if(a.length>i)
			{
			 System.out.println(a[i]);
			}
		}
		
	}

}
