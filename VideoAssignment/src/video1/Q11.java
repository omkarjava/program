package video1;

public class Q11 {

	public static void main(String[] args) {
		int a=9;
				
		int c=0;
		for(int i=2;i<a-1;i++)
		{
			if(a%i==0)
			{
				c=c+1;
			}
		}
		if(c>0)
		{
			System.out.println("Not Prime");
		}
		else 
			System.out.println("prime");
		
		
		
		
		
	}

}
