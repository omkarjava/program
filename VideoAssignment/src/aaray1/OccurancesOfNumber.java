package aaray1;

public class OccurancesOfNumber {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,6,3,1,4,2,6,3};
		
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
				System.out.println(a[i]+" = "+c);
			}
		}
		
		
		
		

	}

}
