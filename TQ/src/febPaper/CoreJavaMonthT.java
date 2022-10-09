package febPaper;

import java.util.ArrayList;
import java.util.Arrays;

public class CoreJavaMonthT {

	public static void main(String[] args) {
		
		 ArrayList <String> a=new ArrayList<>();
		int s=0;
		String f=" ";
		for(int i=1;i<=3;i++)
		{
			 s=219*i;
			 a.add(f.valueOf(s));
			 // f=f.valueOf(s);
		}
        System.out.println(a);
       
        String q="";
        for(int i=0;i<a.size();i++)
        {
          q=q.concat(a.get(i));     
        }
        System.out.println(q);
      char k[]=q.toCharArray();
//      for(int i=0;i<=k.length;i++)
//      {
//    	
//      System.out.println(k[i]);
//      }
      int cnt=0;
      int c=0;
      for(int i=0;i<k.length;i++)
      {
    	  
    	  for(int j=1;j<10;j++)
    	  {
    		  if(k[i]==j)
    		  {
    			  cnt++;
    		  }
    		
    	  }
    	  if(cnt==1)
          {
        	c++;  
          }
    	 
      }
      if(c!=0)
      {
    	  System.out.println("Fascinating Number");
      }
      else
    	  System.out.println("Not Fascinating Number");
      
       int h=Integer.parseInt(q);
       System.out.println(h);
      
	}

}
