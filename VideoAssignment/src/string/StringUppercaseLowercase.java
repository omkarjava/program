package string;



public class StringUppercaseLowercase {

	public static void main(String[] args) {
		String s= "java is a programming language";
		//String s1[]=s.split(" ");
        char ch;
        String s1=" ";
		for(int i=0;i<s.length();i++)
		{
		     ch=s.charAt(i);
		     if(ch>=65&&ch<=90)
		     {
		    	 s1=s1+(char)(ch+32);
		     }
		     else if(ch>=97&&ch<=122)
		     {
		    	 s1=s1+(char)(ch-32);
		     }
		     else
		     {
		    	 s1=s1+ch;
		     }
		}
		System.out.println(s1 +  " " );
		
		
		
	}

}
