package vedioAssignments;
         import java.util.Scanner;
        public class ArrayExample {
        
	    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size");
	    int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Length of element" );
       for(int i=0;i<a.length;i++)
       {
    	  a[i]=sc.nextInt() ;  
    	  System.out.print(  " "+ a[i]);
       }
       
	}

}
