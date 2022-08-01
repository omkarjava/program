package program;

public class p1 {

	public static void main(String[] args) {
		int a=123;
		int b=a;
		int cnt=0,sum=0;
		while(b!=0)
		{
			cnt++;
			b=b/10;	
		}
		b=a;
		while(b!=0)
		{ 
			int s=b%10;
			int p=1;
			for(int i=1;i<=cnt;i++)
			{
				p=p*s;
			}
			b=b/10;
			sum=sum+p;
		}
		System.out.println(sum);

	}

}
