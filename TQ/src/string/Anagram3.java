package string;

public class Anagram3 {

	public static void main(String[] args) {
		String str1="Apple";  
        String str2="ppAle";  
          
         char[] s1 = str1.toCharArray();  
         char[] s2 = str2.toCharArray();  
       
        	 for(int i=0;i<s1.length;i++)
        	 {
        		 for(int j=i+1;j<s1.length;j++)
        		 {
        			 if(s1[i]>s1[j])
        			 {
        				 char b=s1[i];
            			 s1[i]=s1[j];
            			 s1[j]=b; 
        			 }
        			 
        		 }
        	 }

           System.out.println(s1);
           
          	 for(int i=0;i<s2.length;i++)
          	 {
          		 for(int j=i+1;j<s2.length;j++)
          		 {
          			 if(s2[i]>s2[j])
          			 {
          				 char b=s2[i];
              			 s2[i]=s2[j];
              			 s2[j]=b; 
          			 }
          			 
          		 }
          	 }
          
             System.out.println(s2);
               
          int c=0;
          for(int i=0;i<s1.length;i++)
          {
        	  if(s1[i]==s2[i])
        	  {
        		  c++;
        	  }
          }
          if(c==s2.length)
          {
        	  System.out.println("Anagram Strings");
          }
          else
        	  System.out.println("Not Anagram String");
	}

}
