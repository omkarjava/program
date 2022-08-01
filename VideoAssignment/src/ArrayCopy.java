import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array Size");
     int a=sc.nextInt();
     int a1[]=new int [a];
     System.out.println("Enter the element");
    for(int i=0;i<a;i++)
    {
    	a1[i]=sc.nextInt();
    	
    }
    System.out.println(Arrays.toString(a1));
    
    
    
    
    
    
    
    
	}

}
