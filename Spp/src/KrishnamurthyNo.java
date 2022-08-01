       import java.util.Scanner;

        public class KrishnamurthyNo {

	    public static void main(String[] args) {
	    Scanner sc= new Scanner (System.in)	;
		System.out.println("Enter your choice 1");
		int x =sc.nextInt();
		int r=x;
		int sum=0;
		
		while(x>0)
		{
			int s=1;
			int f=x%10;
			for(int i=1;i<=f;i++)
			{
				s=s*i;
			}
			
			sum=sum+s;
			x=x/10;
		}
			System.out.println(sum);
		    if (r==sum)
		    { 	
		   System.out.println("Number is   Krishnamurty");
		    }	
		    else
		   System.out.println("Number is not Krishnamurty");
		
		
	}

}
