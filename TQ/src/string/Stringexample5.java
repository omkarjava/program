    package string;

    import java.util.Arrays;

    public class Stringexample5 {

	public static void main(String[] args) 
	{
		String s1="Java is programming language";
		char ch[]=s1.toCharArray();
		int cnt=0;
        for(int i=0;i<ch.length;i++)
        {
        	if(ch[i]=='a')
        	{
        		cnt++;	
        	}
        	 
        }
        char ch1[]=new char[ch.length-cnt];
        int b=0;		
        for(int i=0;i<ch.length;i++)
        {
        	if(ch[i]!='a')
        	{
        		ch1[b]=ch[i];
        		b++;
        	}
        }
         String s2=new String (ch1);
         System.out.println(s2);
	}

}
