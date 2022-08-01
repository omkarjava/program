package string;

public class OccurancesOfWorld {

	public static void main(String[] args) {
		String s1="Java is programming language";
        char ch[]=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
        	int c=0;
        	for(int j=0;j<ch.length;j++)
        	{
        		if(ch[i]==ch[j])
        		{
        			c++;
        		}
        	}
        	if(c>0)
        	{
        		System.out.println(ch[i]+" "+c);
        	}
        }
		
		
	}

}
