    package string;

    import java.util.Arrays;

    public class Array {

	public static void main(String[] args) {
		int a[]= {4,5,12,1,5,8,7,2};
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
				System.out.println(a[i]+" "+c);	
			}
			
		}
     
		
		
	}

}
