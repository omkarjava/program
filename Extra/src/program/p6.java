package program;

public class p6 {

	public static void main(String[] args) {
		int a=1452145;
       int b=a;
		for(int i=0;i<=9;i++)
		{
			int cnt=0;
			while(a>0)
			{
			  int s=a%10;
			   if(s==i)
			    {
				 cnt++;
			    }
			   a=a/10;
			}
			 a=b;
			 System.out.println(i+" "+cnt);
		  }
		
	}

}
