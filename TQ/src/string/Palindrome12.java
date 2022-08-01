package string;

public class Palindrome12 {

	public static void main(String[] args) {
		 int a=121;
		 int c=a;
		 int s=0;
		 while(c!=0)
		 {
			 int r=c%10;
			  s=s*10+r;
			  c=c/10;
		 }
         System.out.println(s);
         if(s==a)
        	 System.out.println("palindrome");
         else
        	 System.out.println("not palindrome");
	}

}
