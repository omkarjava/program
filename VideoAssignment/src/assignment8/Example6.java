package assignment8;

public class Example6 {

	public static void main(String[] args) {
		String s=" THE ";
		char c[]=s.toCharArray();
		int sum=0;
		for(int i='A';i<='Z';i++)
		{
			for(int  j=0;j<c.length;j++)
			{
				if(i==c[j])
				{
				   sum+=(i-64);
				   
				}
			
			}
			//System.out.println(i);
		}
        System.out.println(sum);
	}

}
