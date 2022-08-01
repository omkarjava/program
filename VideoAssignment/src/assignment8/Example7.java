package assignment8;

public class Example7 {

	public static void main(String[] args) {
		String s="df6/ga8dg#a8v@ad/9";
		char c[]=s.toCharArray();
		int b=0;
		int e=0;
		int f=0;
		
		for(int i=0;i<c.length;i++)
		{
			
			if(c[i]>='a'&&c[i]<='z')
			{
				b++;
			}
			else if(c[i]>='0'&&c[i]<='9')
			{
				e++;
			}
			else
			{
				f++;
			}
			
		}
		System.out.println("No Of Alphabates :"+ b);
		System.out.println("No Of Digits :"+ e);
		System.out.println("No Of Special Characters :"+ e);

	}

}
