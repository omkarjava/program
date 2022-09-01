package aaray1;

public class Test {
public static void main(String[] args) {
	
	int a[]= {1,1,1,2,2,3,4,4,4,5,5,5,5};
	
	int f=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==4)
		{
			f=i;
			break;
		}
	}
	int l=0;
	for(int i=a.length-1;i!=0;i--)
	{
		if(a[i]==4)
		{
			l=i;
			break;
		}
	}
	
	System.out.println(f+" "+l);
}
}
