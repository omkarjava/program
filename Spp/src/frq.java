
public class frq {

	public static void main(String[] args) {
		int num=1453265412;
		int temp=num;
		for(int i=0;i<9;i++)
		{
			int cnt=0;
			
			while(num>0)
			{
			  int t=num%10;
			  if(i==t)	
			 {
				 cnt++;
			 }
			  num=num/10; 
			}
			 num=temp;
			if(cnt>0)
			System.out.println(i+" "+cnt);		
			
		}

	}

}
