         package nestedForLoopPatterns;

         public class wap13 {

	     public static void main(String[] args) {
		 int r=4;
		 for(int i=1;i<=r;i++)
		 {
		 
		 for(int a=1;a<=i;a++)
		 {
		 System.out.print("* ");
		 }
		 System.out.println(); 
          
		 }
		 for(int i=r;i>=1;i--)
		 { 
		 
		 for(int j=1;j<=i;j++)
		 {
		 System.out.print("* ");
		 }
		 System.out.println(); 
        	
		 }

	     }

}
