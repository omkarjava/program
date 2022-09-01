
public class StringSwap {

	public static void main(String[] args) {
		String s="Java";
		char c[]=s.toCharArray();
		
		for(int i=0;i<s.length();i=i+2)
		{
			if(c[i]%2==0)
			{
				char n=c[i];
				c[i]=c[i+1];
				c[i+1]=n;
			}
		}
        System.out.println(c);
        
        for(int i=0;i<4;i=i+2)
        {
        	
        	 char n=c[i];
        	 c[i]=c[i+1];
        	 c[i+1]=n;
       
        	 
        }
        System.out.println(c);
        
        String d="java is language";
        char m[]=d.toCharArray();
        int k=0,l=0;
        for(int i=0;i<m.length;i++)
        {
        	if(m[i]=='a'|| m[i]=='e')
        	{
        		k++;
        	}
        	else if(m[i]=='l'||m[i]=='s')
        	{
        		l++;
        	}
        }
        System.out.println(k+" "+l);
	}

}
