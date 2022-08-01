package video1;

import java.util.Arrays;

public class StringOccurances {

	public static void main(String[] args) {
		String s="programming";
//		String s1="programming";
//		
//		char c[]=s.toCharArray();
//		char c1[]=s.toCharArray();
//		
//		if(c.length==c1.length)
//		{
//			for(int i=0;i<c.length;i++)
//			{
//				for(int j=0;j<c.length;j++)
//				{
//					if(c[i]>c[j])
//					{
//						char g=c[i];
//						c[i]=c[j];
//						c[j]=g;
//					}
//				}
//			}
//			System.out.println(Arrays.toString(c));
//			for(int i=0;i<c1.length;i++)
//			{
//				for(int j=0;j<c1.length;j++)
//				{
//					if(c1[i]>c1[j])
//					{
//						char g=c1[i];
//						c1[i]=c1[j];
//						c1[j]=g;
//					}
//				}
//			}
//			System.out.println(Arrays.toString(c1));
//			
//			int h=0;
//			for(int i=0;i<c1.length;i++)
//			{
//				if(c[i]==c1[i])
//				{
//					h++;
//				}
//			}
//			if(h==c.length)
//			{
//				System.out.println("String is Anagram");
//			}
//			else
//			{
//				System.out.println("String is not Anagram");
//			}
//			
//			
//		}
//		else
//		{
//			System.out.println("String is not Anagram");
//		}
//		
//		
//		
//		
		
		
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int c=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j]&&j<i)
				{
					break;
				}
				if(ch[i]==ch[j]&&j>=i)
				{
					c++;
				}
			}
			if(c!=0)
			{
				System.out.println(ch[i]+"="+c);
			}
		}

	}

}
