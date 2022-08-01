package string;

import java.util.Arrays;

public class String4 {

	public static void main(String[] args) {
		   String s="omkar"  ;
		   char c[]=s.toCharArray();
		  int b=c.length-1;
         for(int i=0;i<2;i++)
         {
        	 char s1=c[i];
 			    c[i]=c[b];
 			    c[b]=s1;
 			    b--;
         }
         System.out.println(Arrays.toString(c));
	}
}
