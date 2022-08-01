    package assignment8;

import java.util.Arrays;

public class Example12 {

	public static void main(String[] args) {
	 String s="java is a programming language";
       
	 String s1[]=s.split(" ");
	
	 int a[]=new int [s1.length];
	 for(int i=0;i<s1.length;i++)
	 {
		 int sum=0;
		 for(int  j=0;j<s1[i].length();j++)
		 {
			 sum=sum +(s1[i].charAt(j)-96);
		 }
		 a[i]=sum;
		 System.out.println(s1[i]+" = "+sum);
	 }
	 System.out.println();
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]>a[j])
			  {
				  String b=s1[i];
				  s1[i]=s1[j];
				  s1[j]=b;
			  }
		  }
		  System.out.print (s1[i]+" ");
	  }
	
	  
	  
	  
	  
	}

}
