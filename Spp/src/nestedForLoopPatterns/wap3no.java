         package nestedForLoopPatterns;

         public class wap3no {

	     public static void main(String[] args) {
		 int r=9;
		 for(int i=1;i<=r;i++)
		 {
		 
		   for(int a=1;a<=i-1;a++)
		    {
		    System.out.print(a );
		    }
		 System.out.println(); 
         
		 }
		  for(int i=r;i>=1;i--)
		  { 
		 
		   for(int j=1;j<=i-1;j++)
		   {
		    System.out.print(j );
		   }
		 System.out.println(); 
       	
		 }

	     }

         }
