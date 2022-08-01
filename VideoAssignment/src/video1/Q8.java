package video1;

public class Q8 {
	

	public static void main(String[] args) {
		for(int no=2; no<=100; no++)
		{
			int temt=0;
			for(int i=2;i<=no-1;i++) 
			{
				 if(no%i==0) 
				  {
				   temt=temt+1;	
			      }
		    }
			   if(temt==0) 
			     {
			 	 System.out.println(no);
			     }
		  
//		 for(int i=2;i<=100;i++)
//		 {
//			 int  te=0;
//			 for(int j=2;j<=i-1;i++)
//			 {
//				 if(i%j==0)
//				 {
//					te=te+1; 
//				 }
//			 }
//			 if(te==0)
//			 {
//			  System.out.println(i);
//			 }
//		 }
		
	}
	}
}
