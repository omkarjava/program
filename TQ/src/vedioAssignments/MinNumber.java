package vedioAssignments;
     import java.util.Scanner;
    public class MinNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Size of Array");
	int  size=sc.nextInt();
	int a[]=new int [size];
	System.out.println("No Of Arry Element");   
	for(int i=0;i<a.length;i++)
	{
		a[i]= sc.nextInt();
	}
	//System.out.println("Array Elements Are:");
     int min=a[0];
     for(int i=0;i<a.length;i++)
     {
    	if( a[i]<min)
    		min=a[i];
     }
     System.out.println("Minimum Value Of Array"+min);
	}

}
