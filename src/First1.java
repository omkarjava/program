import java.util.Scanner;

public class First1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		float d;
		String s;
		char ch;
		System.out.println("Enter 2 numbers: ");
		Scanner scan = new Scanner(System.in);
		s=scan.nextLine();// will not consider the spaces
		ch=scan.next().charAt(0);
		
		System.out.println(s);
		/*a=scan.nextInt();  //20
		b=scan.nextInt();  //30
*/		
		/*d=scan.nextFloat();
		
		c=a+b;
		
		System.out.println("Addition is: "+c+" is positive");*/
		scan.close();

	}

}
