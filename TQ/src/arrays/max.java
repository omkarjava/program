package arrays;

public class max {

	public static void main(String[] args) {
		int a[]= {20,0,31,45,100,1,105,90};
		int b=a.length;
		int max=105;
       for(int i=0;i<a.length;i++)
       {
    	   if(a[i]>max)
    		   max=i;
    		  
       }
       System.out.println(max); 
	}

}
