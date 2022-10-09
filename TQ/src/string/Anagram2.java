package string;

    import java.util.Arrays;

    public class Anagram2 {

	public static void main(String[] args) {
		String str1="Apple";  
        String str2="ppAle";  
          
         char[] string1 = str1.toCharArray();  
         char[] string2 = str2.toCharArray();  

        
        	for(int i=0;i<string1.length;i++)
        	{
        		for(int j=i+1;j<string1.length;j++)
        		{
        			if(string1[i]>string1[j])
        			{
        				char b=string1[i];
        				string1[i]=string1[j];
        				string1[j]=b;
        			}
        		}
        	}
        	 System.out.println("Sorted Array:"+Arrays.toString(string1));
        
        	for(int i=0;i<string2.length;i++)
        	{
        		for(int j=i+1;j<string2.length;j++)
        		{
        			if(string2[i]>string2[j])
        			{
        				char b=string2[i];
        				string2[i]=string2[j];
        				string2[j]=b;
        			}
        		}
        	}
        	 System.out.println("Sorted Array:"+Arrays.toString(string2));
        	 
        	int c=0;
        	if(string1.length==string2.length)
        	{
        		for(int i=0;i<string1.length;i++)
            	{
        			if(string1[i]==string2[i])
        			{
        				c++;
        			}
            	}
        		
        	
        	  if  (c==string1.length)
        	   {
        		System.out.println(" Anagram Strings ");
        	   }
        	 else
        		System.out.println(" Not Anogram Strings ");
        	  }
        	else
        	  {
        		System.out.println("Not Anogram Strings ");
        	  }
        	 

}
}