package string;

public class Stringexample7 {

	public static void main(String[] args) {
		String s="Java is programming language";
          String str="";
          String st[]=s.split("");
          for(int i=0;i<st.length;i++)
          {
        	  if(st[i].equals("a"))
        	  {
        		  st[i]="";
        	  }
        	  str=str+st[i];
          }
          System.out.print(str);
          
          
          
          
	}

}
