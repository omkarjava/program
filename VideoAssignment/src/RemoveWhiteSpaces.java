import java.util.Arrays;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s="java is   progra  mming lan guage";
		 
		char c[]=s.toCharArray();
		String s1=" ";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=' ')
			{
			 s1=s1+c[i];
			}
		}
	    System.out.println(s1);
	    
	    
	    
	    //method 2
//		s=s.replaceAll(" ", "");
//        
//          System.out.println(s);
          
          
          //method 3
	    
	    String s2=" ";
	    for(int i=0;i<c.length;i++)
	    {
	    	if(c[i]!=' ')
	    	{
	    		s2=s2+s.charAt(i);
	    	}
	    }
          System.out.println(s2);
          
	}

}
