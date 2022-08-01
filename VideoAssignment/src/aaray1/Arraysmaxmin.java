   package aaray1;

   import java.util.Arrays;

   public class Arraysmaxmin {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,1,2,3,4,5};

//	    int b[]=new int [5];
	    
	    int c=0;
	    for(int i=0;i<a.length;i++)
	    {
		  if(a[i]%2==0)
		  {
			  c++;
		  }
	    }
	    int e[]=new int [c];
	    int n=0;
	    for(int i=0;i<a.length;i++)
	    {
	    	if(a[i]%2==0)
	    	{
	    		e[n]=a[i];
	    		n++;
	    		
	    	}
	    }
	    System.out.println(Arrays.toString(e));
}
}