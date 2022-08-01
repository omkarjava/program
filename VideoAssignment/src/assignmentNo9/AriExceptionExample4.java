package assignmentNo9;

public class AriExceptionExample4 {
//	 void add(int a,int b)
//	{
//		System.out.println(" Additon is: "+(a+b));
//	}
//	   Example4()
//	   {
//		   super("User define exception");
//	   }
	 void div(int a) throws AgeException
	{
         
         if(a<18)
         {
           throw new  AgeException("Age not complete") ;
         }
         else if(a>18)
         {
        	 throw new  AgeException("Age complete") ; 
         }
        
	}

	    public static void main(String[] args) {
		AriExceptionExample4 e=new AriExceptionExample4();
	    int a=5;
		try 
		{
	
		 e.div(a);
	    }
		catch(AgeException s)
		{
			s.printStackTrace();
		}
        System.out.println("Done");
	}

}
