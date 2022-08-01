        package aaray1;

        import java.util.Scanner;

        public class Arrays1 {

	    public static void main(String[] args) {
	    	   String s;
//	    	      Scanner sc= new Scanner(System.in);
//	    	      s= sc.nextLine();
//	    	     
	    	    s="good bye bye world world" ; 
	    	    String s1[]=s.split(" ");
	    	    for(int i=0;i<s1.length;i++)
	    	    {
	    	    	int c=0;
	    	      for(int j=i+1;j<s1.length;j++)
	    	      {
	    	        if(s1[i].equals(s1[j]))
	    	        {
	    	          c++;
	    	          s1[j]="#";
	    	        }
	    	      }
	    	      if(c>0 && s1[i]!="#")
	    	      {
	    	    	  System.out.print(s1[i]+" ");
	    	      }
	    	      
	    	    }
	    	    	

	}

}
