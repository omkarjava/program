    package exceptionhandling;

    import java.util.Scanner;

    public class NestedTry {
	static void add(int a,int b)
	{
		System.out.println(" Additon is: "+(a+b));
	}
	static void div(int a,int b)
	{
		System.out.println(" Division is: "+(a/b));

	}
	static void array(int dr[],int i)
	{
		System.out.println(" element at index : "+dr[i]);
	}
	static void str(String s,int j)
	{
		System.out.println(s.charAt(j));
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		   int dr[]= {4,5,6,2,3};
		   System.out.println("2 numbers"); 
		   String s="india";
           int a= sc.nextInt();
           int b= sc.nextInt();
           try
           {
        	   try
        	   {
        		   try 
        		    {
        			array(dr,8);
        		    }
        		    catch(ArrayIndexOutOfBoundsException e)
        		    {
        			System.out.println(e); 
        		     }
        		 str("india",6);
        	   }
        	   catch (StringIndexOutOfBoundsException e)
        	   {
        		   System.out.println(e);
        	   }
        	   div(a,b);
           }
           catch(ArithmeticException e)
           {
        	   System.out.println(e);
           }
		   
           add(a,b);
           System.out.println("Complete");

	}

}
