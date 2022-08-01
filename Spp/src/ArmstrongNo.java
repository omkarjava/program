

import java.util.Scanner;

            public class ArmstrongNo {

	        public static void main(String[] args) {
	        int cnt=0;
		    Scanner sc= new Scanner (System.in)	;
			System.out.println("Enter your choice 1");
			int x =sc.nextInt();
			int temp=x;
			int sum=0;
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
		//	System.out.println(sum);
			if(sum==x)
		   System.out.println("Number is   Armstrong");
				
		    else
		   System.out.println("Number is not Armstrong"); 	
		    }
	        

	        }


