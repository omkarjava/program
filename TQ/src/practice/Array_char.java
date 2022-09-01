package practice;

import java.util.Arrays;

public class Array_char {
public static void main(String_Array[] args) {
	
	
	char ch[]= {'a','F','j','K','e','i','T','H','v','S'};
	System.out.println(Arrays.toString(ch));
	
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]>='a' && ch[i]<='z')
		{
			int a=(int)(ch[i]);
			ch[i]=(char)(a-32);
		}
		else if(ch[i]>='A' && ch[i]<='Z')
		{
			int a=(int)(ch[i]);
			ch[i]=(char)(a+32);
		}
	}
	System.out.println(Arrays.toString(ch));
	
}
}
