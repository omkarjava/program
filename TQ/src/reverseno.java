        import java.util.Arrays;
        import java.util.Scanner ;
        public class reverseno {

	    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the array element");
        for(int i=0;i<a.length;i++)
        {
         a[i]=sc.nextInt();    
        }
        System.out.println("Array Elements");
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+"  ");
        }
        System.out.println();
        
        System.out.print("Reverse Array Elements ");
        
        System.out.println();
       
        int j=a.length;
        for(int i=0;i<j/2;i++)
        { 
        int b=a[i];
        a[i]=a[j-i-1];
        a[j-i-1]=b;
        }
       
        System.out.println(Arrays.toString(a));
         
       
       
        
        }  

	    
  }