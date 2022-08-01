import java.util.Scanner;

public class DigitAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,sum=0; //345   543   1234   4321
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		
		while(num!=0) //   num=345             num=34         num=3       num=0
		{
			int r=num%10;// r=5               r=34%10=4      r=3%10=3
			sum=sum+r;   // sum=0+5=5         sum=5+4=9      sum=9+3=12
			num=num/10;  // num=345/10=34     num=34/10=3    num=3/10=0
		}
		
		
		System.out.println("Addition is: "+sum);

	}

}
