
public final class Armstrong1 {

	public static void main(String[] args) {
		int a=153;
		int c=0;
		int b=a;
		
		int p=0;
		while(b!=0)
		{
			c++;
			b=b/10;
		}
       // System.out.println(c);
        System.out.println(a);
        while(a!=0)
        {
        	int n=a%10;
        	int s=1;
        	for(int i=1;i<=c;i++)
        	{
        		s=s*n;
        	}
        	a=a/10;
        	p+=s;		
        }
        System.out.println(p);
        
	}

}
