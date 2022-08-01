        package practice;

        public class armStrongNo {

	    public static void main(String[] args) {
	
	    int x =145;
		int temp=x;
		int sum=0,cnt=0;
		while(temp!=0)
		{
			cnt++;
		
			temp=temp/10;
		}
		temp=x;
		while(temp!=0)
		{  
			int r=temp%10;
			int pow=1;
		for(int i=1;i<=cnt;i++)	
		{
        pow=pow*r;
		}
		temp=temp/10;
		sum=sum+pow;
		}
		System.out.println(sum);
	}

}
