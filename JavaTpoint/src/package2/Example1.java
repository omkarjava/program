package package2;

public class Example1 {

	public static void main(String[] args) {
		
		 String s="5dfe64fe6f9";
		  int d=0;
		  int b=0;
		  int h=0;
		 for(int i=0;i<s.length();i++)
          {
	         char a=s.charAt(i);
            if(a>48 && a<58)
            {
            	d=d+(a-48);
            	b++;
            }
          }
		 System.out.println(d/b);
        System.out.println(d);
	}

}
