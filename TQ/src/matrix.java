
public class matrix {
	int a[][];
	public void Display(int a[][],int r,int c)
	{
		  for(int i=0;i<a.length;i++)  
	      {
	    	  for(int j=0;j<a.length;j++)
	    	  {
	    		  
	    		  System.out.println(a[i][j]+" ");
	    	  }
	    	  System.out.println();
	      }
	}

	public static void main(String[] args) {
		int a[][]= {{456},{654},{789}};
        int i,j;
      int  l=a.length;
      for(i=0;i<l;i++)  
      {
    	  for(j=0;j<l;j++)
    	  {
    		  
    		  System.out.println(a[i][j]+" ");
    	  }
    	  System.out.println();
      }
      
   System.out.println("\n");   
      
      for(i=0;i<l;i++)  
      {
    	  for(j=0;j<l;j++)
    	  {
    		  if(i<=j)
    		  System.out.println(a[i][j]);
    		  else
    		  System.out.println(" ");
    	  }
    	  System.out.println();
      }
	}

}
