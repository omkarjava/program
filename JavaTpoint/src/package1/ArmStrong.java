package package1;

public class ArmStrong {

	public static void main(String[] args) {
		int a=153;
		int c=0;
		
		int sum=0;
		int m=a;
		while(a>0)
		{
			int v=a%10;
			c++;
			a=a/10;
		}
         System.out.println(c);
         a=m;
         while(m>0)
         {
        	 int b=m%10;
        	 int s=1;
        	 for(int i=1;i<=c;i++)
        	 {
        	   s=s*b;
        	 }
        	 m=m/10;
        	 sum+=s;
         }
         System.out.println(sum);
         
         if(sum==a)
        	 System.out.println("ArmStrong No");
         else
        	 System.out.println("Not ArmStrong");
         
	}

}
