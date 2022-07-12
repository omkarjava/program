package string;

public class Anagram13 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Bye";
		String s3="Hi";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		char c3[]=s3.toCharArray();
		for(int i=0,j=0,k=0;i<c1.length;i++,j++,k++)
		{
			System.out.print(c1[i]);
			if(j<c2.length)
			{
				System.out.print(c2[j]);
			}
			if(k<c3.length)
			{
				System.out.print(c3[k]);
			}
			System.out.println();
		}
		
//		for(int i=0,j=0,k=0;i<c1.length;i++)
//		{
//			System.out.print(c1[i]);
//				if(j<c2.length)
//				{
//					System.out.print(c2[j]);
//				}
//				if(k<c3.length)
//				{
//					System.out.print(c3[k]);
//				}
//			System.out.println();
//			
//		}
//		
		
		
		
		
		
		
		
		
	}

}
