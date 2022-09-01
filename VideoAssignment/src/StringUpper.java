import java.util.Scanner;

public class StringUpper {

	public static void main(String[] args) {
//		String str="zEnSaR";
//		String ouputstr="";
//		//WRITE LOGIC HERE
//	    char c[]=str.toCharArray();
//		for(int i=0;i<c.length;i++)
//	  {
//	    if(c[i]>='a'&&c[i]<='z')
//	    {
//	     ouputstr =(int)(char)(c[i]-32);
//	    }
//	    else if(c[i]>='A'&&c[i]<='Z')
//	    {
//	     ouputstr=(char)(int)(c[i]+32);
//	    }
//	  }
//	    
//		for(int i=0;i<str.length();i++)
//		{
//			char d=str.charAt(i);
//			if(d>=97 &&d<=122)
//			{
//				ouputstr+=(char)(d-32);
//				
//			}
//			else if(d>=65 &&d<=90)
//			{
//				ouputstr+=(char)(d+32);
//				
//			}
//					
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		String ouputstr="";
		//WRITE LOGIC HERE
		for(int i=0;i<str.length();i++)
	  {
	    char s=str.charAt(i);
	    if(s>=97 && s<=122)
	    {
	      ouputstr+=(char)(s-32);
	    }
	    else if(s>=65 && s<=90)
	    {
	      ouputstr+=(char)(s+32);
	    }
	  }
		System.out.println(ouputstr);
		

		
		
		
		
		
	//	System.out.println(ouputstr);
		

	}

}
