package vedioAssignments;
         import java.util.Scanner;
        public class MaxNumber {
	    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a[]=new int [5];
		System.out.println("number of elements");
		for(int i=0;i<a.length;i++)
		{
		   a[i]=sc.nextInt();	
		}
		int max=a[0];//4
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)	//4>4=4/2>4/8>/
			max=a[i];//max=4/9/
		}
		 System.out.println(max);
		
		
		
		
		
		
		
		
	}
	
	
}
