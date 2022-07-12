        import java.util.Scanner;
        public class ReplaceNo {

	    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=sc.nextInt();
		int a[]=new int [ size];
		System.out.println("Enter the no of Element");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        
        }
       
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]==0)
        	{
        		a[i]=1;
        	}
        	System.out.println(a[i]);
        }
        
	    }

}
