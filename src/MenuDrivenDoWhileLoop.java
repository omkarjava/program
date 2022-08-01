import java.util.Scanner;

public class MenuDrivenDoWhileLoop {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		int ch,a,b;
		char c='n';
		do
		{
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		ch=sc.nextInt();
		
		System.out.println("Enter 2 numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		
		switch(ch)
		{
			case 1:  System.out.println("Addition is: "+(a+b));
			break;
			
			case 2: System.out.println("Substraction is: "+(a-b));
			break;
			
			case 3: System.out.println("multiplication is: "+(a*b));
			break;
			
			case 4: System.out.println("Division is: "+(a/b));
			break;
			
			default: System.out.println("invalid input");
			
		}
		
		System.out.println("Do you want to continue:(y/n): ");
		c= sc.next().charAt(0);
		
		
		}while(c=='y'||c=='Y');
		
		System.out.println("Done");

	}

}
