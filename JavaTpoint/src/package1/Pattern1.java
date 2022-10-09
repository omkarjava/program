package package1;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {

//	  for(int i=6;i>=0;i--)
//	  {
//		  for(int j=0;j<=i;j++)
//		  {
//			  System.out.print(" ");
//		  }
////		  for(int k=i;k<=i;k++)
////		  {
////			  System.out.print("*");
////		  }
//		  for (int k = 1; k <= (2*i -1) ;k++)   
//		  {  
//		     if( k==1 || i == 6 || k==(2*i-1))   
//		     {  
//		       System.out.print("*");  
//		     }  
//		      else   
//		      {  
//		       System.out.print(" ");  
//		      }  
//		  }  
//		  System.out.println("");  
//	  }  
		 
		  
		int i, j, k, row=9;  
		for (i=1; i<= row ; i++)  
		{  
		     for (j = i; j < row ; j++)   
		     {  
		     System.out.print(" ");  
		     }     
		   for (k = 1; k <= (2*i -1) ;k++)   
		   {  
		      if(k==1 || i == row || k==(2*i-1))   
		    {  
		    System.out.print(" * ");  
		    }  
		    else   
		    {  
		     System.out.print(" ");  
		    }  
		   }  
		System.out.println();  
		}  
		  
		  
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the number of rows you want to print: ");  
		int rows = sc.nextInt();      
		for (i=1; i<= rows ; i++)   
		{  
		  for (j = rows; j > i ; j--)   
		  {  
		   System.out.print(" ");  
		  }  
		  System.out.print("*");  
		    for (k = 1; k < 2*(i -1) ;k++)   
		    {   
		      System.out.print(" ");   
		    }  
		       if( i==1)   
		       {   
		       System.out.println("");  
		       }  
		       else  
		       {  
		        System.out.println("*");   
		       }  
		}   
		for (i=rows-1; i>= 1 ; i--)  
		 {  
		    for (int m = rows; m > i ; m--)   
		     {  
		      System.out.print(" ");  
		     }  
		  System.out.print("*");  
		for (int l = 1; l < 2*(i -1) ;l++)   
		 {  
		  System.out.print(" ");  
		 }  
		  if(i==1)  
		   System.out.println("");  
		  else  
		  System.out.println("*");    
		}
		
		

	}

}
