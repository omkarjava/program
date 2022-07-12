    package array;

    public class MaxNoIndexPosition {

	public static void main(String[] args) {
		int a[]= {20,5,310,45,100,1,105,90};
		int b=a.length;
		int max=0;
		int s=0;
       for(int i=0;i<a.length;i++)
       {
    	   if(a[i]>max )
    	   {
   		   max=a[i];
    	   s=i;
    	   } 
       }
        System.out.println("Maximum No: "+ max +" " +" Maximum No Index : "+ s );

	}

}
