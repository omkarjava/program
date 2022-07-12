package string;

public class String11CharIndex {

	public static void main(String[] args) {
		String s1="the quick brown for jumps over the lazy dog";
        char ch []=s1.toCharArray();
        
        for(char i='a';i<'z';i++)
        {
        	
        	for(int j=0;j<ch.length;j++)
        	{
        		if(ch[j]==i)
        		{
        			System.out.println(i+" "+j);
        		}
        	}
        	
        	
        }

	}

}
