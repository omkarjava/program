package video1;

public class Lowercasestring {

	public static void main(String[] args) {
		String s= "JAVA IS A PROGRAMMING LANGUAGE";
        String a=" ";
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
        	if(ch>=65&&ch<=90)
        	{
        		a=a+(char)(ch+32);
        	}
        	else
        		a=a+ch;
       	
        }
         System.out.println( a +" ");
         
	}

}
