    package arraylistAssignment;

    import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

    public class Example1 {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how much digit");
		int a=sc.nextInt();
		for( int i=0;i<a;i++)
		{
			if(i%2!=0)
			{
			  al.add(i);
			}
		}
		
		System.out.println(al);
		

	}

}
