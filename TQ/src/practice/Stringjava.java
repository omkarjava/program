package practice;

import java.util.Arrays;

public class Stringjava {

	public static void main(String[] args) {
		String a="java";//ajav
		char c[]=a.toCharArray();
		for(int i=0;i<c.length;i=i+2)
		{
			char d=c[i];
			c[i]=c[i+1];
			c[i+1]=d;
		}
       System.out.println(Arrays.toString(c));
	}

}
