package exception;

public class NestedTry extends Car {
	
	 void div(int a,int b)
	{
		System.out.println(" Division is: "+(a/b));

	}
	 void array(int dr[],int i)
	{
		System.out.println(" element at index : "+dr[i]);
	}
	 void str(String s,int j)
	{
		System.out.println(s.charAt(j));
	}
	

	public static void main(String[] args) {
		NestedTry n=new NestedTry();
		int dr[]= {4,5,6,6,1,5,9};
		     try 
		     {
		
		     try 
		      {
		    	 try
			     {
	               n.str("java", 5);
			     }
			     catch(StringIndexOutOfBoundsException s)
			     {
			    	 System.out.println("how");
			     }
               n.array( dr, 7);
		      }
		      catch(ArrayIndexOutOfBoundsException a)
		      {
		    	 System.out.println("hi");  
		      }
		    
		      n.div(5, 0);
		}
		catch(ArithmeticException e)
		{
          System.out.println("hello");
       
	    }

}
}