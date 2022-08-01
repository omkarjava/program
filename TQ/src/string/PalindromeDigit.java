package string;

import java.util.Scanner;

public class PalindromeDigit {

	public static void main(String[] args) {
//		 String original, reverse = ""; 
//	      Scanner in = new Scanner(System.in);   
//	      System.out.println("Enter a string/number to check if it is a palindrome");  
//	      original = in.nextLine();   
//	      int length = original.length();   
//	      for ( int i = length - 1; i >= 0; i-- )  
//	         reverse = reverse + original.charAt(i);  
//	      if (original.equals(reverse))  
//	         System.out.println("Entered string/number is a palindrome.");  
//	      else  
//	         System.out.println("Entered string/number isn't a palindrome.");  
		
//        String a="1125211";
//        String s,d="";
//        
//	    int f=a.length();
//	    for(int i=f-1;i>=0;i--)
//	    {
//	    	d=d+a.charAt(i);
//	    }
//	    if (a.equals(d))  
//	         System.out.println("Entered number is a palindrome.");  
//	      else  
//	         System.out.println("Entered number isn't a palindrome.");  
//		  
//	    int r,sum=0,temp;    
//	    int n=1125211;
//	    
//	    temp=n;    
//	    while(n>0){    
//	     r=n%10;   
//	     sum=(sum*10)+r;    
//	     n=n/10;    
//	    }    
//	    if(temp==sum)    
//	     System.out.println("palindrome number ");    
//	    else    
//	     System.out.println("not palindrome");  
		int a=1125211;
		String s=String.valueOf(a);
		String m="";
		System.out.println(s);
         int g=s.length();
         for(int i=g-1;i>=0;i--)
         {
        	 m=m+s.charAt(i);
         }
         System.out.println(m);
		
	      
	      
	      
	      
	}

}
