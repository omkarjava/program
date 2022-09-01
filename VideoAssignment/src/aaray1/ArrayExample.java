package aaray1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayExample {

	public static void main(String[] args) {
		
		int a[]= {5,4,1,0,7};
		int b[]= {7,5,9,4,8};
		
//		HashMap<Integer,Integer>hs=new HashMap<>();
//		ArrayList<Integer>al=new ArrayList<>();
//		 
//		for(int i=0;i<a.length;i++)
//		{
//			al.add(a[i]);
//		}
//		for(int i=0;i<b.length;i++)
//		{
//			al.add(b[i]);
//		}
//		System.out.println(al);
//		
//		HashSet<Integer>h=new HashSet<Integer>();
//		
//	    for(int i=0;i<al.size();i++)
//	    {
//	    	h.add(al.get(i));
//	    }
//     
//	    System.out.println(h);
//	    
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c+=a[i];
				}
			}
		}
		System.out.println(c);
//		int d=0;
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length;j++)
//			{
//				if(a[i]==a[j]&& j<i)
//				{
//					break;
//				} 
//			}
//		}
//	    System.out.println(d);
	}

}
