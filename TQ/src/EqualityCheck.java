             import java.util.Scanner;

             public class EqualityCheck {

	         public static void main(String[] args) {
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter the Array1 Size");
		     int size=sc.nextInt();
		     int a[]=new int [ size];
		
		     System.out.println("Enter the Array2 Size");
		     int m=sc.nextInt();	
		     int b[]=new int [ m];
		     System.out.println("Enter the no of Element1");
             for(int i=0;i<a.length;i++)
              {
              a[i]=sc.nextInt();
              }
             System.out.println("Enter the no of Element2");
             for(int i=0;i<b.length;i++)
             {
        	 b[i]=sc.nextInt();
             }
           for(int i=0;i<a.length;i++)
             {
             if(  size==m )
             System.out.println("NO of Size Are Equal");   
             else
             System.out.println("NO of Size Are Not Equal");
             break;
             }
             for(int i=0;i<b.length;i++)
             {
             if ( a[i]==b[i] )
             System.out.println("NO of Element Are Equal");
             else 
             System.out.println("No Of Elements Not Equal");
             break;
             }
       

	                     }

                                 }
