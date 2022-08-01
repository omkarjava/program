package string;

public class StringsFirstCharacter {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Bye";
		String s3="Hi";
		char c[]=s1.toCharArray();
		char c1[]=s2.toCharArray();
		char c2[]=s3.toCharArray();
		for(int i=0,j=0,k=0;i<c.length;i++,j++,k++)
		{
			System.out.print(c[i]);
			if(j<c1.length)
			{
				System.out.print(c1[j]);
			}
			if(k<c2.length)
			{
				System.out.print(c2[k]);
			}
			System.out.println();
		}
		
		
		
	}

}
