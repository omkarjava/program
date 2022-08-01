      package nestedForLoopPatterns;

      public class hexagoneABC {

	   public static void main(String[] args) {
		 int r=4;
		 for(int i=1;i<=r;i++)
		  {
		    for(int j=1;j<=r-i;j++)
		     {
		     System.out.print(" ");
		     }
		   char ch='A';
		    for(int a=1;a<=i;a++)
		     {
		     System.out.print(ch+" ");
		      ch++;
		      }
		  System.out.println(); 
           
		  }
		 for(int i=r-1;i>=1;i--)
		  { 
		    for(int j=1;j<=r-i;j++)
		    {
		     System.out.print(" ");
		    }
		    char ch='A';
		  for(int j=1;j<=i;j++)
		   {
		   System.out.print(ch+" ");
		   ch++;
		   }
		 System.out.println(); 
        	
		 }

	}

}
