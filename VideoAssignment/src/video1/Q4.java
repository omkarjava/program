package video1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 System.out.println("select the Operation");
		 System.out.println("for Addtion 1 +Substraction 2 + multiplication 3 + Division 4 ");
		 int d=sc.nextInt();
		switch(d)
		{
		case 1:System.out.println(a+b); 
		break;
		case 2:System.out.println(a-b); 
		break;
		case 3:System.out.println(a*b); 
		break;
		case 4:System.out.println(a/b); 
		break;
		default:
		System.out.println("Invalid Operation");
		}

	}

}
