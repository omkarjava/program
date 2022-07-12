        import java.util.Scanner;

        public class MissingNos {

	    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array1 Size");
		int size=sc.nextInt();
		int a[]=new int [ size];
		System.out.println("Enter the no of Element1");
        for(int i=0;i<a.length;i++)
          {
            a[i]=sc.nextInt();
          }
        int cnt=1;
        for(int i=0;i<a.length;)
        {
        	if(a[i]==cnt)
        	{  
        		i++;
        		cnt++;
        		
        	}
        	else
        	 {
            System.out.println(cnt);
        	cnt++;
           //cnt=cnt+2;
             }
        }

	}

}
