     package loop;

     public class patern {

	 public static void main(String[] args) {
		int n=5,i,j;
     for(i=n-1;i>=0;i--)
	  { 
		for(j=1;j<=n-1;j++)
		 {
		  System.out.println(" ");	
		 }
		   for(j=0;j<=i;j++)
	       {
			System.out.print(" "+"  *");
	       }
		     System.out.println();
	  }
	}

}
