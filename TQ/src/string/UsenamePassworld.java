package string;

import java.util.Scanner;

public class UsenamePassworld {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username:");
        String s=sc.next();
        System.out.println("Enter Passworld");
        String p=sc.next();
        int c=p.length();
        int a=0,n=0,m=0;
        int f=2,g=3,j=1;
        for(int i=0;i<c;i++)
        {
        	char ch=p.charAt(i);
        	if(Character.isUpperCase(ch))
        	{
        	  a++;	
        	}
        	else if(Character.isLowerCase(ch))
        	{
        		n++;
        	}
        	else if(Character.isDigit(ch))
        	{
        		m++;
        	}

        	
        }
        
         if(a>=f && n>=g && m>=j)
         {
        	 System.out.println("valid passworld");
         }
         else
         {
        	 System.out.println("passworld did not have enough");
        	 if(a<f)
        		 System.out.println("uppercase latter");
        	 if(n<g)
        		 System.out.println("lowercase latters");
        	 if(m<j)
        	 {
        		 System.out.println("digit");
        	 }
         }
	}

}
