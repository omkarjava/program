package aaray1;

public class DublicateElement {

	public static void main(String[] args) {
	    String s="good bye bye world world" ; 
	    String s1[]=s.split(" ");
	    for(int i=0;i<s1.length;i++)
	    {
	    	int c=0;
	      for(int j=i+1;j<s1.length;j++)
	      {
	        if(s1[i].equals(s1[j]))
	        {
	          c++;
	         
	        }
	      }
	      if(c>0)
	      {
	    	  System.out.print(s1[i]+" ");
	      }
	      
	    }

	}

}
