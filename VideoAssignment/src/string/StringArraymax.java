package string;

public class StringArraymax {

	public static void main(String[] args) {
		String  a[] = {"hi", "how", "are", "you", "doing"};
		int max;
		for(int i=0;i<a.length;i++)
		{
			max=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j].compareTo(a[i])>0)
				{
					max=j;
				}
			}
			String c=a[i];
			a[i]=a[max];
			a[max]=c;
		}
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
		
		
		
		
	}

}
