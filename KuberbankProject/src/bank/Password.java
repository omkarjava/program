    package bank;
 
    import java.util.Scanner;

    public class Password {
    	
    	static boolean checkpassword(String input)
    	{
    		int uc=0;
    		int lc=0;
    		int d=0;
    		int length=input.length();
    		for(int i=0;i<length;i++)
    		{
    			char ch=input.charAt(i);
    			if(Character.isUpperCase(ch))
    			{
    				uc++;
    			}
    			else if(Character.isLowerCase(ch))
    			{
    				lc++;
    			}
    			else if(Character.isDigit(ch))
    			{
    				d++;
    			}
    		}
    		if(uc<=2 && lc<=2 && d<=2)
    		{
    		 System.out.println("Password Is Valid");
    		 return true;
    		}
    		else 
    		{
    			System.out.println("Password did not have enough of the following");
    			if(uc<2)
    			{
    				System.out.println("uppercase letter");
    			}
    			if(lc<2)
    			{
    				System.out.println("lowercase letter");
    			}
    			if(d<2)
    			{
    				System.out.println("Digits");
    			}
    			
    			return false;
    		}
    		
    	}
	
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
//	int uc=0;
//	int lc=0;
//	int d=0;
	
	System.out.println("Enter your Password");
	String input=s.next();
	Password.checkpassword(input);
//	int length=input.length();
//	for(int i=0;i<length;i++)
//	{
//		char ch=input.charAt(i);
//		if(Character.isUpperCase(ch))
//		{
//			uc++;
//		}
//		else if(Character.isLowerCase(ch))
//		{
//			lc++;
//		}
//		else if(Character.isDigit(ch))
//		{
//			d++;
//		}
//	}
//	if(uc>=2 && lc<=2 && d>=2)
//	{
//	 System.out.println("Password Is Valid");
//	}
//	else 
//	{
//		System.out.println("Password did not have enough of the following");
//		if(uc<2)
//		{
//			System.out.println("uppercase letter");
//		}
//		if(lc<2)
//		{
//			System.out.println("lowercase letter");
//		}
//		if(d<2)
//		{
//			System.out.println("Digits");
//		}
//		
//		
//	}
//	
	
    
	}

}
