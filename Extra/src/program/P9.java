package program;

public class P9 {
	

	public static void main(String[] args) {
		
		
		for(int no=2;no<50;no++)
		{
			int s=0;
			for(int i=2;i<no-1;i++)
			{
				if(no%i==0)
				{
				  s=s+1;
				}
				
			}
			if(s==0)
				System.out.println(no);
				
		}
	
	}

}
