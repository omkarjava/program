package video1;

public class Q10 {

	public static void main(String[] args) {
		int a=4;
		int c=0;
		while(a>0)
		{
			for(int i=1;i<a-1;i++)
			{
				
				if(a/i==0)
				{
					c++;
				}
				
			}
		}
		if(c>0)
			System.out.println("n");
		else
			System.out.println("p");

	}

}
