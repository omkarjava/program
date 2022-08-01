package mock;

public class MinimumNo {

	public static void main(String[] args) {
		int b=45123;
		int small=9;
		
		while(b!=0)
		{
			int r=b%10;
			if(small>r)
			{
			  small=r;
			}
		     b=b/10;
		}
		System.out.println(small);
				

	}

}
