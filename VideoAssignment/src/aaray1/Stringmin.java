    package aaray1;

    import java.util.Arrays;

    public class Stringmin {

	public static void main(String[] args) {
		String  a[] = {"hi", "how", "are", "you", "doing"};
		
		int  min;
		String temp;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j].compareTo(a[min])<0)
				{
//					temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		
		
	}

}
