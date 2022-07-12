package string;

public class Stringexample6 {

	public static void main(String[] args) {
		String s1="Java is programming language";
		char ch[]=s1.toCharArray();
		int cnt=0;
        for(int i=0;i<ch.length;i++)
        {
        	if(ch[i]!='a')
        	{
        		System.out.print(ch[i]);	
        	}
        	 
        }
        
         
	}

	}


