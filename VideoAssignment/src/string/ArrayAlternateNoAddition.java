package string;

public class ArrayAlternateNoAddition {

	public static void main(String[] args) {
	int a[]= {4,5,6,8,9,7,2,3,4,5,6};
	
//	int sum=0;
//	for(int i=0;i<a.length;i=i+2)
//	{
//       sum+=i;
//	//	System.out.println(a[i]);
//	}
//	System.out.println(sum);
//
//	}
	int sum=0;
	int odd=0;
	int even=0;
	for(int i=0;i<a.length;i++)
	{
		sum+=a[i];
		if(a[i]%2==0)
		{
			even+=a[i];
		}
		if(a[i]%2!=0)
		{
			odd+=a[i];
		}
	}
	System.out.println(sum);
	System.out.println(even);
	System.out.println();
	System.out.println("Even:"+(sum-even)+" "+"Odd:"+(sum-odd)); 
	
	
	
	
	}
}
