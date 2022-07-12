package array;

import java.util.Scanner;

public class DifferenceForloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Difference");
//		int a=sc.nextInt();
		  System.out.println("Enter Two Number");
		 int b2=sc.nextInt();
		 int b3=sc.nextInt();
		 System.out.println("Enter index");
		 int f=sc.nextInt();
//		 System.out.println("enter N value of iterations ");
//		 int n=sc.nextInt();
		 int a=b3-b2;
		
		for(int i=1;i<f;i++)
		{
			b2=b2+a;
		}
        System.out.println(b2);
        
       
//		 int g=0;
//        for(int i=1;i<n;i=i+a)
//        {
//             g=(f-1)*a+b2;  
//        }
//        System.out.println(g);
	}

}
