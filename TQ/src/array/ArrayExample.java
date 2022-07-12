        package array;

        import java.util.Scanner;

        public class ArrayExample {
        public static void main(String[] args) 
        {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		size=sc.nextInt();
		int a[]=new int [size];
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter element");
		for(int i=0;i<=size-1;i++)
		{
			a[i]=ac.nextInt();
			
		}
		int sum=0;
		System.out.println("element of array:");

		for(int i=0;i<=size-1;i++)
		{ 
			if (a[i]%2==0)
			{
        	sum=sum+a[i];
        	}
		}
		 System.out.println("sum of even no :"+ sum);
		 int s=0;
		 for(int i=0;i<=size-1;i++)
			{ 
				if (a[i]%2!=0)
				{
	        	s=s+a[i];
	        	}
			}
	     System.out.println("sum of odd no :"+ s);
			 
		 
	}

}
