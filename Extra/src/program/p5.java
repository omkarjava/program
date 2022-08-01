        package program;

        public class p5 {

	    public static void main(String[] args) {
		int a=145,sum=0;
		int b=a;
		
		while(a!=0)
		{
		   int p=1;
		   int s=a%10;
		   for(int i=1;i<=s;i++)
		    {
		 	 p=p*i;
		    }
		    a=a/10;
		   sum=sum+p;
		   
		}
		System.out.println(sum); 
		
	}

}
