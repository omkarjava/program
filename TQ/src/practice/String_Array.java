package practice;

public class String_Array {
public static void main(String[] args) {
	
	
	String a[]= {"hello","good","day"};
	
	String b=a[0];
	String c=a[1];
	String d=a[2];
	
	char c1[]=b.toCharArray();
	char c2[]=c.toCharArray();
	char c3[]=d.toCharArray();
	for(int i=0,j=0,k=0;i<c1.length;i++,j++,k++)
	{
		System.out.print(c1[i]);
		if(j<c2.length)
		{
			System.out.print(c2[j]);
		}
		if(k<c3.length)
		{
			System.out.print(c3[k]);
		}
		System.out.println();
	}
}
}
