         package vedioAssignments;
         import java.util.Scanner;
         public class AlternateValueprint {

	     public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter The Size Of Array");
         int size=sc.nextInt();
         int a[]=new int[size];
         System.out.println("Enter The No Of Element");
         for(int i=0;i<a.length;i++)
         {
        	 a[i]=sc.nextInt();
         }
         for(int i=0;i<a.length;i++)
         {
        	if(a[i]%2!=0) 
        	System.out.print( " " + a[i]);	
         }
         
         
         
         
	}

}
