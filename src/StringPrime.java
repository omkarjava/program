
public class StringPrime {

	public static void main(String[] args) {
		String s="dv5d938s27d89";
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			if(Character.isDigit(c[i]))
           {
				int a=2;                                            
				int b=c[i];   
				while(b<=c[i])
				{
					if(c[i]%a==0)
					{
						break;
					}
					b++;
				}
				if(c[i]<b)
				{
					System.out.println("prime Number="+c[i]);
				}	
           }
		}
//		int a=8;
//		int b=2;
//		int c=a;
//		while(c<=a)
//		{
//			if(a%b==0)
//			{
//				break;
//			}
//			c++;
//				
//		}
//		if(c>a)
//		{
//			System.out.println("p");
//		}
//		else
//			System.out.println("np");
		

	}

}
