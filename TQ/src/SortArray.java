        import java.util.Arrays;

        public class SortArray {

	    public static void main(String[] args) {
		int arr[]= {50,10,2,8,12,5,6};
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
         System.out.println("Sorted Array:"+Arrays.toString(arr));   
         System.out.println("Second lowest:"+arr[5]);
         
         
         
         
         int ar[]= {50,10,2,8,12,5,6};
 		int len=ar.length;
 		for(int i=0;i<length;i++)
 		{
 			for(int j=0;j<length-1;j++)
 			{
 				if(ar[j]>ar[j+1])
 				{
 					int temp=ar[j];
 					ar[j]=ar[j+1];
 					ar[j+1]=temp;
 				}
 		    }
 		}
          System.out.println("Sorted Array:"+Arrays.toString(ar));   
          System.out.println("Second highest:"+ar[len-2]);
         
         
         
         
         
         
         
         
         
	}

}
