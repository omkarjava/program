

      public class primeNo400to300 {

	  public static void main(String[] args) {
		
	  
	  for( int i=300; i<=400;i++)
	  {
	  int  c=0;
	  for(int a=2;a<=i/2;a++)
	  {
		  if(i%a==0)
		  {
			  c++;
			
		  }
	  }
	  if(c==0)
	  System.out.println(i);
			  
	  }
	  }
	  }

      