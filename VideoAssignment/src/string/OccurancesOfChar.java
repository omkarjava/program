package string;

public class OccurancesOfChar {

	public static void main(String[] args) {
		String s1="the quick brown for jumps over the lazy dog";
        char ch[]=s1.toCharArray();
       for(int i=0;i<ch.length;i++)
       {
    	   int c=1;
    	   for(int j=i+1;j<ch.length;j++)
    	   {
    		   if(ch[i]==ch[j])
    		   {
    			   c++;
    		   }
    	   }
    	   if(c>0)
    	   {
    		   System.out.println(ch[i]+"="+c);
    	   }
       }
	}

}
