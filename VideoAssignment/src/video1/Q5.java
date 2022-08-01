    package video1;

    public class Q5 {

	public static void main(String[] args) {
		int a=145;
		int sum=0;
		while(a>0)
		{
			int p=1;
			int s=a%10;
		  for(int i=1;i<=s;i++)	
		  {
			  p=p*i;
		  }
		    sum=sum+p;
		    a=a/10;
		    
		  
		}
		  System.out.println(sum);
		
		

	}

}
