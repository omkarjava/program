package practice;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		String s="i java fine";
		String c[]=s.split(" ");
	  
		int i=0;
		System.out.println(c[i]);
		for( i=1;i<c.length-1;i++)
		{
			char a[]=c[i].toCharArray();
			for(int j=0;j<a.length/2;j++)
			{
				char f=a[j];
				a[j]=a[a.length-(j+1)];
				a[a.length-(j+1)]=f;
			}
			String h= new String(a);
			System.out.println(h);
		}
       System.out.println(c[i]);
	
    
//	String k="java";
//	char q[]=k.toCharArray();
//	 
//	for(int j=0;j<q.length/2;j++)
//	{
//		char o=q[j];
//		q[j]=q[q.length-(j+1)];
//		q[q.length-(j+1)]=o;
//	}
//	System.out.println(Arrays.toString(q));
//     }  
	}
	}
