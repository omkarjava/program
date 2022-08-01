package aaray1;

public class StringOccurances {

	public static void main(String[] args) {
		String s="java is a programming language";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int cn=0;
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j]&&j<i)
				{
					break;
				}
				if(c[i]==c[j]&&j>=i)
				{
					cn++;
				}
			}
			if(cn!=0)
			{
				System.out.println(c[i]+"="+cn);
			}
		}

	}

}
