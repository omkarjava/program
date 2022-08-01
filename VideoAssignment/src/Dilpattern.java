
public class Dilpattern {

	public static void main(String[] args) {
		for(int i=8/2;i<=8;i+=2)
		{
			for(int j=0;j<8-i;j+=2)
			{
			 System.out.print(" ");	
			}
			for(int j=1;j<=i;j++)
			{
			 System.out.print("*");	
			}
			for(int j=1;j<8-i;j++)
			{
			 System.out.print(" ");	
			}
			for(int j=1;j<=i;j++)
			{
			 System.out.print("*");	
			}
			System.out.println();
		}
        for(int i=8;i>=1;i--)
        {
        	for(int j=i;j<8;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int j=1;j<=(i*2)-1;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
		
		
		
		
		
		
		
	}

}
