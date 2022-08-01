package assignment8;

public class Example4 {

	public static void main(String[] args) {
		String s="df6/ga8dg#a8v@ad/9";
		char c[]=s.toCharArray();
		int b=0;
		int e=0;
		int f=0;
		int g=0;
		for(int i=0;i<c.length;i++)
		{
			
			if(c[i]!='9'&& c[i]!='6'&& c[i]!='8')
			{
				b++;
			}
			
			
		}
		System.out.println("No Of Alphabates :"+ b);
	
		for(char j='a';j<'z';j++)
		{
			for(int i=0;i<c.length;i++)
			{
				if(j==c[i])
				{
					e++;
				}
			
			}
		}
		System.out.println("No Of Alphabates :"+ e);
		System.out.println();
		for(int  j=48;j<58;j++)
		{
			for(int i=0;i<c.length;i++)
			{
				if(j==c[i])
				{
					f++;
				}
			
			}
		}
		System.out.println("No Of Digits :"+ f);
		for(int i=0;i<c.length;i++)
		{
			
			if(c[i]=='/'||c[i]=='#'|| c[i]=='@')
			{
				g++;
			}
			
			
		}
		System.out.println("Special Characters: "+g);
		
		
	}

}
