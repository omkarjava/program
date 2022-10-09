package example;

public class Aray {
public static void main(String[] args) {
	int a[]= {4,5,7,6,8,3,2,1};
	
//	int c=8;
//	for(int i=0;i<a.length;i++)
//	{
//		if(a[i]==c-1 || a[i]==c+1)
//		{
//			System.out.println(a[i]);
//		}
//	}
	int s=0;
	int d=0;
	int f=5;
	for(int i=0;i<a.length;i++)
	{
	   if(s<f)
	   {
		 d=s;
		 s=a[i];
	   }
	  else if(f>d)
	   {
		 s=a[i];
	   }
	}
	System.out.println(d+" "+s);
}
}
