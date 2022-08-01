     package aaray1;

     public class StringMax {

	 public static void main(String[] args) {
     String  a[] = {"hi", "how", "are", "you", "doing"};
		
		int  max;
		String temp;
		for(int i=0;i<a.length;i++)
		{
			max=i;
			for(int j=0;j<a.length;j++)
			{
				if(a[j].compareTo(a[max])>0)
				{
					max=j;
				}
			}
			
			temp=a[i];
			a[i]=a[max];
			a[max]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
