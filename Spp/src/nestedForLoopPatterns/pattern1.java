      package nestedForLoopPatterns;

      public class pattern1 
      {

	  public static void main(String[] args) 
	  {
		/*int i,j;
	  for(i=0;i<=5;i++);
	  {
		  for(j=0;j<=5;j++); 
		  {
			
			  System.out.println("%");  
			  
		  }
		  System.out.println();
	  }
       
	  } */
		  
		  int a,b,c;
		
		  for(int i=0;i<5;i++)
		  {
			
			 
	      for(int j=0;j<=i;j++)
		  {
					/*
					 * if(j==0) System.out.print("0 "); else if (j==1) System.out.print("1 "); else
					 * if (j==2) System.out.print("1 "); else if (j==3) System.out.print("2 "); else
					 * if (j==4) System.out.print("3 ");
					 */
		  a=0;
	      b=1;
		  System.out.print(a+" ");
		  System.out.print(b+" ");
		  while(b<1)
		 {
		   c=a+b;
		   System.out.print(c+" ");
		   a=b;
		    b=c;
		 }
	   }
			  
			  System.out.println();
		  }
		  
	  }
      }    
