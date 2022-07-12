      package array2d;

      import java.util.Scanner;

      public class SubtractMatrix 
      {
	  public void sustract (int b[][],int a[][],int r,int c,int r1,int c1)
	   { 
		System.out.println("Sustraction of Array");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
			System.out.print(b[i][j]-a[i][j]+" ");	
			}
			System.out.println();
		}
	   }
	  
	  public void Display  (int a[][],int r,int c)
	  {
		  System.out.println("First Array");
		  for(int i=0;i<r;i++)
		  {
			  for(int j=0;j<c;j++)
			  {
				  System.out.print(a[i][j]+" ");
			  }
			  System.out.println();
		  }
		  System.out.println("Second Array");
	  }
	      
	  public void 	deatil(int b[][],int r1,int c1)
	  {
		  for(int i=0;i<r1;i++)
		  {
			  for(int j=0;j<c1;j++)
			  {
				System.out.print(b[i][j]+" ");
			  }
			  System.out.println();
		  }
		
	  }
	    

	  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ARRAY1 ROW AND COLUMN");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println("ARRAY1 ELEMENT");
		 int a[][]=new int [r][c];
		 
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("ARRAY2 ROW AND COLUMN");
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("ARRAY2 ELEMENT");
		int b[][]=new int [r1][c1];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		SubtractMatrix s=new SubtractMatrix ();
        s.Display(a, r, c);
		s.deatil(b, r1, c1);
		s.sustract(a,b, r, c,r1,c1);
		
	}

}
