import java.util.Arrays;

public class ReverseNo1 {

	public static void main(String[] args) {
		//  int a=999;
//	        
//		   int b=0;
//		   while(a!=0)
//		   {
//			   int c=a%10;
//			    b=(b*10)+c;
//			    a=a/10;
//			    
//		   }
//	      System.out.println(b);
	     
	      
	      
	      
	      
	      
	      
	      
		 
		int a[]= {10,10,7,8,5,6,54,6,8};
		
//		int fh=0;
//		int  sh=0;
//		for(int i=0;i<a.length;i++)
//		{
//			
//			if(a[i]>fh)//10
//			{
//				sh=fh;// sh=0
//				fh=a[i];//fh=10
//			}
//			 if (a[i]>sh)
//			{
//				sh=a[i];
//			}
//			
//		}
//	
//		System.out.println(fh+" "+sh);
//		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[1]);
		System.out.println(a[0]);
		 
       
		
	}

}
