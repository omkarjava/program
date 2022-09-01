import java.util.Scanner;

public class Xobin {


	public static int secondHighest(int... a) 
	{
	int high1=0,high2=0;
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
		//int a[] = new int[10];
		int a[]= {4,5,2,5,7,8,9};
        Scanner sc=new Scanner(System.in);
        int sum=0;
    	//int high1=0,high2=0;
//        for(int i=0;i<a.length;i++)
//        {
//           if(a[i]>high1)
//           {
//             high2=high1;
//             high1=a[i];
//           }
//           else if(a[i]>high2)
//           {
//             high2=a[i];
//           }
//         
//
//        }
        for(int i=0;i<a.length;i++)
        {
        	 if(a[i]<Xobin.secondHighest(a))
             {
               sum+=a[i];
             } 
        }
		System.out.println(sum);

//		int a[]= {4,5,2,5,7,8,9};
//        Scanner sc=new Scanner(System.in);
//        int sum=0;
//    	int high1=0,high2=0;
//        for(int i=0;i<a.length;i++)
//        {
//           if(a[i]>high1)
//           {
//             high2=high1;
//             high1=a[i];
//           }
//           else if(a[i]>high2)
//           {
//             high2=a[i];
//           }
//         
//
//        }
//        for(int i=0;i<a.length;i++)
//        {
//        	 if(a[i]!=high1 && a[i]!=high2)
//             {
//               sum+=a[i];
//             } 
//        }
//		System.out.println(sum);

	}
}
