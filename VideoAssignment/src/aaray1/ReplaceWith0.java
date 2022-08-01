package aaray1;

public class ReplaceWith0 {

	public static void main(String[] args) {
		int a[]= {72,69,76,76,79};
		int j=a.length;
		for(int i=0;i<a.length;i++)
		{
			int b=a[i]%10;
			
			if(b==9)
			{
			a[i]=0;
			}
			System.out.print(a[i]+" ");
		}
        
	}

}
