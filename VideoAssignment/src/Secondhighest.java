import java.util.Scanner;

public class Secondhighest {
	public static int secondHighest(int... a) {
		int high1=0,high2=0;
		//WRITE LOGIC HERE
	    for(int i=0;i<a.length;i++)
	    {
	      if(a[i]>high1)
	      {
	        high2=high1;
	        high1=a[i];
	      }
	      else if(a[i]>high2)
	      {
	        high2=a[i];
	      }
	    }
			return high2;
		}

		public static void main(String[] args) {
			int a[] = new int[10];
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Write Array");
	        for(int i=0;i<a.length;i++)
	        {
	        	a[i]=sc.nextInt();
	        	
	        }
	        //  int a[]= {4,5,12,8,9,10,43,7,3,1};
	        int sum=0;
	        for(int i=0;i<a.length;i++)
	        {
	        //WRITE LOGIC HERE TO TAKE INPUT FRO ARRAY
	        	//a[i]=sc.nextInt();
	         if(a[i]<Secondhighest.secondHighest(a)) 
	         {
	           sum+=a[i];
	         }
	          
	        }
			//WRITE LOGIC HERE FOR PROBLEM STATEMENT

			System.out.println(sum);

		}
}
