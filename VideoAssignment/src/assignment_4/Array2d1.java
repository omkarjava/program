package assignment_4;

public class Array2d1 {

	public static void main(String[] args) {
		int arr[][] ={{22, 31, 9}, {12, 25, 16}};
		  int r=2;
		  int c=3;
          for(int i=0;i<r;i++)
          {
    	   for(int j=0;j<c;j++)
    	    {
    		   if(i==0&&j==1||i==1&&j==1)
    		   {
    			   System.out.print(arr[i][j]+" ");
    		   }
    	    }
         }
	} 

}
