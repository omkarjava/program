    package string;

    import java.util.Arrays;
import java.util.Scanner;

    public class AnagramString {
    	public void AnagramString(String s,String a)
    	{
    	  char[] c=s.toCharArray();	
    	  for(int i=0;i<c.length;i++)
    	  {
           for(int j=i+1;j<c.length;j++)
           {
        	   if(c[i]>c[j])
        	   {
        		   char w=c[i];
        		   c[i]=c[j];
        		   c[j]=w;
        	   }
           }
    	  }  
    	  System.out.println(c);
    	  char[] c1=s.toCharArray();	
    	  for(int i=0;i<c1.length;i++)
    	  {
           for(int j=i+1;j<c1.length;j++)
           {
        	   if(c1[i]>c1[j])
        	   {
        		   char w=c1[i];
        		   c1[i]=c1[j];
        		   c1[j]=w;
        	   }
           }
    	  }  
    	  System.out.println(c1);
    	}
    	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first ");
		String s=sc.next();
		System.out.println("Enter The Second");
		String a=sc.next();
		AnagramString b=new AnagramString();
		
		b.AnagramString(s, a);

	}

}
