    package assignment_4;

    import java.util.Arrays;
    import java.util.Scanner;

    public class Array {

	public static void main(StringExample[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Arrays size");
		int a=sc.nextInt();
		System.out.println("Enter Element");
		int a1[]=new int [a];
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
        System.out.println(Arrays.toString(a1));
//        System.out.println("Enter the No");
//        int c=sc.nextInt();
        int d=0,e=0,f=0,g=0;
        for(int i=0;i<a1.length;i++)
        {
        	if(a1[i]==0)
        	{
        	  d++;	
        	}
             if(a1[i]%2==0)
        	{
        	  e++;
        	}
        	 if(a1[i]%2!=0)
        	{
        		f++;
        	}
        	 if(a1[i]<0)
        	{
        		g++;
        	}
        	
        }
//        if(d>0)
//    	{
//    		System.out.println("Number is Not Present");
//    	}
        
        //System.out.println(Arrays.toString(a1));
        if(d>0)
        {
        	System.out.println("Number of Zeros :"+d);
        }
        if(e>0)
        {
        	System.out.println("number of odd:"+e);
        }
        if(f>0)
        {
        	System.out.println("number of even:"+f);	
        }
        if(g>0)
        {
        	System.out.println("Number of negative:"+g);
        }
	}

}
