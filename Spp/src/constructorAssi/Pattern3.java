        package constructorAssi;
        import java.util.Scanner;
        public class Pattern3 {

	    public static void main(String[] args) {
		int i,j,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No");
		 r=sc.nextInt();
	 
	    for(i=1;i<=r;i++)
	    {
	     char ch='A';
	     for(j=r;j>=i;j--)
	     {
	    	 System.out.print(ch);
	    	 ch++;
	     }
	     System.out.println();
	    }
	    for(i=1;i<=r;i++)
	    {
	    char b='A';
	    for(j=1;j<=i;j++)
	    {
	    	System.out.print(b);
	    	b++;
	    }
	   System.out.println();
	    }
	    
	   
	    
	    
	    
	    
	   /* for(i=1;i<=r;i++)
	    { 
	    	/*int a;
	    	for(a=1;a<=r-i;a++)
	    	{
	    		System.out.print(" ");
	    	}*/
	    	/*ch='A';
	    	for(j=1;j<=i;j++)
	    	{
	    		System.out.print(ch);
	    		ch++;
	    	}
	    	System.out.println();
	    	
	        }
	         char c='A';
	        for( i=5;i>r;i--)
	       {
	    	for( j=1;j<=i;j++)
	    	{
	    	System.out.print(c);
	    	c++;
	    	}
	    	System.out.println();
	       }*/

	}

}
