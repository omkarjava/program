package string;

public class Stringaverageofnumber {

	public static void main(String[] args) {
		String s="a5i9gfj4tabc";
		
		char c[]=s.toCharArray();
		int ave=0;
		int d=1;
		int a=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=48;j<=58;j++)
			{
				if(c[i]==j)
				{
				  ave=ave+(j-48);
				   a++;
				}
			}
		}
		d=ave/a;
		System.out.println("Average is: "+d);
		
	}

}
