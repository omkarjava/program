package string;

public class String16SpecialWorld {

	public static void main(String[] args) {
		String s="EXCISTANCE";
		char c[]=s.toCharArray();
		int a=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[0]==c[c.length-1])
		  {
			a++;
		  }
		}
         if(a>0)
         {
        	 System.out.println("Special World");
         }
         else
        	 System.out.println("Not Special World");
	}

}
