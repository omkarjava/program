package practice;

public class Armstrong {

	public static void main(String[] args) {
		int r=145;
		int sum=0;
		int p=1;
		int m=r;
		int cnt=0;
    while(r!=0)
    {
    	cnt++;
    	m=m/10;
    }
    m=r;
    while(r!=0)
    {
    	int s=r%10;
    	for(int i=1;i<=cnt;i++)
    	{
    		p=p*s;
    	}
    	r=r/10;
    	sum=sum+p;
    }
    System.out.println(sum);
		
		
		
		
		
		
		
	}

}
