       package string;

       import java.util.Arrays;
       import java.util.Scanner;

       public class XobinAnagram {
	 
//		public static boolean checkAnagram(String first, String second)
//		{
//			boolean isAnagram = false;
//		int a=first.length();
//		int b=second.length();
//		if(a==b)
//		{
//	    char []c=first.toCharArray();
//	    for(int i=0;i<c.length;i++)
//	    {
//	      for(int j=i+1;j<c.length;j++)
//	      {
//	        if(c[i]>c[j])
//	        {
//	          char w=c[i];
//	          c[i]=c[j];
//	          c[j]=w;
//	        }
//	      }
//	    }
//	    char []c1=first.toCharArray();
//	    for(int i=0;i<c1.length;i++)
//	    {
//	      for(int j=i+1;j<c1.length;j++)
//	      {
//	        if(c1[i]>c1[j])
//	        {
//	          char w=c1[i];
//	          c1[i]=c1[j];
//	          c1[j]=w;
//	        }
//	      }
//	     
//	    }
//	   if(c==c1)
//	   {
//		   isAnagram=true;  
//	   }
//	   else if(c!=c1)
//	   {
//		   isAnagram=false;   
//	   }
//		}
//		else
//		{
//			   isAnagram=false; 	
//		}
//	  
//		return isAnagram;
//	    
//		}
//		public static void main(String[] args) {
//	      //DO NOT EDIT GIVEN CODE
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("1st");
//			String first = sc.next();
//			System.out.println("2nd");
//			String second = sc.next();
//		   //LOGIC FOR METHOD CALL
//			boolean isAnagram=XobinAnagram.checkAnagram(first,second);
//		   
//		    System.out.println(isAnagram);
//
//		}
//       }
    	   public static boolean checkAnagram(String first, String second)
    		{
    			boolean isAnagram = false;
    			// write Logic Here
    	   int a=first.length();
    	   int b=second.length();
    	   if(a==b)
    	   {
    		   String m=first.toLowerCase();
    		   String n=second.toLowerCase();
    		   
    		   char x[]=m.toCharArray();
    		   char y[]=n.toCharArray();
    		   
    		   Arrays.sort(x);
    		   Arrays.sort(y);
    		   
    		   if(Arrays.equals(x, y))
    		   {
    			   isAnagram= true;
    		   }
    		   else
    		   {
    			   isAnagram=false;
    		   }
    	   }
    	   else
    	   {
    		   isAnagram=false;
    	   }
    		return isAnagram;
    	    
    		}
    		public static void main(String[] args) {
    	      //DO NOT EDIT GIVEN CODE
    			Scanner sc = new Scanner(System.in);
    			System.out.println("1st");
    			String first = sc.next();
    			System.out.println("2nd");
    			String second = sc.next();
    		   //LOGIC FOR METHOD CALL
    		    boolean isAnagram= XobinAnagram .checkAnagram(first,second);
    		    
    		    System.out.println(isAnagram);
}
}