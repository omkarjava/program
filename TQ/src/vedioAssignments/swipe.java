package vedioAssignments;

import java.util.Arrays;

            public class swipe {

         	public static void main(String[] args) {
		    int a[]= {110,9,15,30,4};
//		    int j=a.length;
//	        for(int i=0;i<j/3;i++)
//	        { 
//	        	
//	        int b=a[i];
//	        a[i]=a[i+2];
//	        a[i+2]=a[j-i-1];
//	        a[j-i-1]=a[i+1];
//	        a[i+1]=a[j-i-2];
//	        a[j-i-2]=b;
//	        }
//	       
//	      System.out.println(Arrays.toString(a));
	        
	       for(int i=0;i<2;i++)
	       {
	    	   int k=a.length-1;
	    	   int b= a[0];
	    	   for(int j=0;j<a.length;j++)
	    	   {
	    		   if(j+1==a.length)
	    		   {
	    			   break;
	    		   }
	    		   else
	    		   {
	    			   a[j]=a[j+1];
	    		   }
	    	   }
	    	   a[k]=b;
	       }
	       
	       System.out.println(Arrays.toString(a));
	}

}
