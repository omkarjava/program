package string;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
	  String s="omkar"  ;
	  char c[]=s.toCharArray();
	  
      for(int i=0;i<c.length;i++)
      {
    	  for(int j=0;j<c.length;j++)
    	  {
    		  if(c[i]>c[j])
    		  {
    			  char a=c[i];
    			  c[i]=c[j];
    			  c[j]=a;
    					  
    		  }
    	  }
      }
      for(char d:c)
      {
    	  System.out.print(d);
      }
	}

}
