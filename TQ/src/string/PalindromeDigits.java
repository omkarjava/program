package string;

import java.util.Scanner;

public class PalindromeDigits {

	public static void main(String[] args) {
		  int num;
	      Scanner sc= new Scanner(System.in);
	      System.out.println("Enter numbers");
	 	  num=sc.nextInt();
	      String s=String.valueOf(num);
	      String d="";
	      int a=s.length();
	      for(int i=a-1;i>=0;i--)
	      {
	         d=d+s.charAt(i);
	      }
	     if(s.equals(d))
	      System.out.print("palindrome");
	     else
	      System.out.print("not palindrome");

	}

}
