    package aaray1;

    public class Arraysfrequency {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,1,2,9,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
					a[j]='#';
				}
			}
			
			if(a[i]!='#')
			{
			System.out.println(a[i]+" = "+c);
			}
		}

	}

}
