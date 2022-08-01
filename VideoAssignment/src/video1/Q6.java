package video1;

public class Q6 {

	public static void main(String[] args)
	{
		
		for(int no=2; no<=50;no++)
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
//			   else
//			   {
//				temt=0;
//			   }
		}
	}
	}
	
   


