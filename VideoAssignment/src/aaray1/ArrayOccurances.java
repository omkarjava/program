package aaray1;

public class ArrayOccurances {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,1,2,9,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
			   if(a[i]==a[j]&&j<i)
			   {
				   break;
			   }
			   if(a[i]==a[j]&&j>=i)
			   {
				   c++;
			   }
			}
			if(c!=0)
			{
			System.out.println(a[i]+" "+c);
			}
		}

	}

}
