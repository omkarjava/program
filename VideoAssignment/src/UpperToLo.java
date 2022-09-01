
public class UpperToLo {

	public static void main(String[] args) {
		String s="java";
//		char c[]=s.toCharArray();
//		for(int i=0;i<c.length;i++)
//		{
//		 if(c[i]>='a' && c[i]<='z') 
//		 {
//			 c[i]+=((int)(char)-32);
//		 }
//		 if(c[i]>='A'&& c[i]<='Z')
//		 {
//			 c[i]+=((int)(char)+32);
//		 }
//		}
		String s1="  ";
       for(int i=0;i<s.length();i++)
       {
    	   char d=s.charAt(i);
    	   if(d>=97 &&d<=122)
    	   {
    		   s1+=(char)(d-32);
    	   }
    	   else if(d>=65 && d<=90)
    	   {
    		   s1+=(char)(d+32);
    	   }
//    	   else
//    	   {
//    		   s1+=d;
//    	   }
       }
       System.out.println(s1);
       Scanner sc=new Scanner(System.in);
   	String str=sc.next();
   	String ouputstr="";
   	//WRITE LOGIC HERE
   	for(int i=0;i<str.length();i++)
     {
       char d=str.charAt(i);
       if(d>=97 &&d<=122)
       {
         ouputstr+=(char)(d-32);
       }
       else if(d>=65 &&d<=90)
       {
         ouputstr+=(char)(d+32);
       }
     }
   	System.out.println(ouputstr);
   	

	}

}
