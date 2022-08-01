    import java.util.Scanner;

    public class krishnamurtiNo {

	public static void main(String[] args) {
    Scanner sc= new Scanner (System.in)	;
	System.out.println("Enter your choice 1");
	int x =sc.nextInt();
	int temp=x;
	int sum=0;
	while(x>0)
	{
	int a=1;
	int r=x%10;
	for(int i=1;i<=r;i++)
	{
	      a=a*i;	
	}
	     sum=sum+a;
	       x=x/10;
	}
	System.out.println(sum);
    if (temp==sum)
    { 	
   System.out.println("Number is   Krishnamurty");
    }	
    else
   System.out.println("Number is not Krishnamurty"); 
    }
    }