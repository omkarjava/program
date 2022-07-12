package array2d;

public class matarix {
	
	int r,c;
	int a[][];
	 void addelements(int a[][],int r,int c)
	   {
		//int sum=0;
		for(int i=0;i<r;i++)
		{
			
		     for(int j=0;j<c;j++)
		     {
			 if(r<c)
			 System.out.println(a[i][j]);
				
		      }
			System.out.println();
		}
	}





	 public void displayarray(int a[][],int r,int c)
	{
	  System.out.println("Elements Of Array:");	
	  for(int i=0;i<r;i++)
	    { 
		for(int j=0;j<c;j++)
		  {	
		  System.out.print(a[i][j]+" ");
		  }
	    System.out.println();
	    }
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
