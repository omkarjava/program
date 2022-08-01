package program;

public class p4 {

	public static void main(String[] args) {
		int a=145;
		int b=a,sum=0;
		int cnt=0;
       while(b!=0)
       {
    	cnt++; 
    	b=b/10;
       }
    //   System.out.println(cnt);
       b=a;
       while(b!=0)
       {
        int c=b%10;
        int p=1;
          for(int i=1;i<=cnt;i++)
            {
    	     p=p*c;
    	    
            }
             b=b/10;
             sum=sum+p;
       System.out.println(sum);
       }
	}

}
