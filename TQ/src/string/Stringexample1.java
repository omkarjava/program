package string;

import java.util.Arrays;

public class Stringexample1 {

	public static void main(String[] args) {
		String s1="Java is programming language";
		char ch[]=s1.toCharArray();
		//System.out.println(Arrays.toString(ch));
	    int d[]=new int [ch.length];
		int i,j;
		for( i=0;i<ch.length;i++)
		{
			int cnt=1;
			for( j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					cnt++;
					d[j]=-1;
				}
			}
			//System.out.println(ch[i]+ " --- " +cnt);
			if(d[i]>=0)
			{
				d[i]=cnt;
			}
		}
       for( i=0;i<ch.length;i++)
       {
    	   if(d[i]>0 && ch[i]!=' ')
    	   {
    		   System.out.println(ch[i]+"--"+d[i]);
    	   }
       }
	}

}
