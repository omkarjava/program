package string;

public class StringSpecialNo {

	public static void main(String[] args) {
//		String s="wrlihg5w5w6gw46";
//		int c=0;
//		int b=0;
//		for(int i=0;i<s.length();i++)
//		{
//			int j=s.charAt(i);
//			if(j>65&&j<122)
//			{
//				c++;
//			}
//			if(j>48&&j<58)
//			{
//				b++;
//			}
//		}
//       System.out.println(c+" "+b);
//       
       String d="khbkHjb";
       String s="";
       for(int i=0;i<d.length();i++)
       {
    	   int j=d.charAt(i);
    	   if(j>97&&j<122)
    	   {
    		  s+=(char)(j-32); 
    	   } 
    	   if(65>j&&j<96)
    	   {
    		   s+=(char)(j+32);
    	   }
    	   
    	   
       }
       System.out.println(s);
	}

}
