package string;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String str1="Apple";  
        String str2="ppAle";  
        
        char ch[]=str1.toCharArray();
        char ch1[]=str2.toCharArray();
        if(ch.length==ch1.length)
        {
        	for(int i=0;i<ch.length;i++)
        	{
        		for(int j=i+1;j<ch.length;j++)
        		{
        			if(ch[i]>ch[j])
        			{
        			char s=ch[i];
        			ch[i]=ch[j];
        			ch[j]=s;
        			}
        		}
        	}
        	System.out.println(Arrays.toString(ch));
        	for(int i=0;i<ch1.length;i++)
        	{
        		for(int j=i+1;j<ch1.length;j++)
        		{
        			if(ch1[i]>ch1[j])
        			{
        			char s=ch1[i];
        			ch1[i]=ch1[j];
        			ch1[j]=s;
        			}
        		}
        	}
        	System.out.println(Arrays.toString(ch1));
        	int c=0;
        	for(int i=0;i<ch.length;i++)
        	{
        		if(ch[i]==ch1[i])
        		{
        			c++;
        		}
        	}
        	if(c==ch1.length)
        	{
        		System.out.println("Anagram");
        	}
        	else
        		System.out.println("not anagram");
        	
        	
        	
        }

	}

}
