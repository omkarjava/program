import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,temp,cnt=0,sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		temp=num;
		//153 
		//count the number of digits
		// each digit should be raised o the count
		//add them all
		
		while(temp!=0)//153   15         1     0
		{
			cnt++;  //cnt=1   2         3
			temp=temp/10; //15   1      0
		}
		
		temp=num;
		
		while(temp!=0)//153
		{
			int r= temp%10; //3
			//int pow=Math.pow(r, cnt);//input is of type double
			int pow=1;
			for(int i=1;i<=cnt;i++)//i=1     i=2           i=3        i=4
			{
				pow=pow*r;    // pow=1*3=3   pow=3*3=9    pow=9*3=27
			}
			temp=temp/10;
			sum=sum+pow;
		}
		
		if(sum==num)
			System.out.println("Armstrong number");
		else
			System.out.println("Not armstrong");

	}

}
