package program;

public class Armstrong {

	public static void main(String[] args) {
		int a=145;
		int b=a;
		int cnt=0;
		
		int sum=0;
         while(a!=0)
         {
        	 cnt++;
        	 a=a/10;
         }
         //System.out.println(cnt);
         a=b;
         while(a!=0)
         {
        	
        	int s=a%10;
        	 int p=1;
        	for(int i=1;i<=cnt;i++)
        	  {
        	   p=p*s;	
        	   }
        	  sum=sum+p;
        	  a=a/10;
        	
         }
         System.out.println(sum);
        
	}

}
