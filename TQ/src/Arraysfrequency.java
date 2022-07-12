    import java.util.Arrays;

    public class Arraysfrequency {

	public static void main(String[] args) {
		  int a[]= {5,8,9,7,9,4,9,3,5,8,9};
		  int b[]=new int [a.length];
		  int count=0;
//		  for(int i=0;i<a.length;i++)
//		  {
//		
//			  for(int j=i+1;j<a.length;j++)
//			  {
//				  if(a[i]>a[j])
//				  {
//					 a[i]=a[i]+a[j]; 
//					 a[j]=a[i]-a[j]; 
//					 a[i]=a[i]-a[j]; 
//					  
//				  }
//			  }
//			  
//		  }
//		 
		  for(int i = 0; i < a.length; i++)
		  { 
			  
			  for(int j = 0; j < a.length; j++)
			  {
				  if(a[i]==a[j])
				  {
					 count=count+1;
				  }  
			  }
			int t=i;
			i=i+count;
			System.out.println(a[t]+" = "+count);
			  
			count=0;  
			  
	      }  
	        System.out.println( "----------------------------------------");  
	}

}
