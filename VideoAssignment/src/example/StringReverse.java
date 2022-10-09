package example;

public class StringReverse {

	public static void main(String[] args) {
		String s="Hi how are you students";
		String s1[]=s.split(" ");
		System.out.println(s1[0]);
		for(int i=1;i<s1.length-1;i++)
		{
			String a=s1[i];
			char c[]=a.toCharArray();
			for(int j=0;j<c.length/2;j++)
			{
				char d=c[j];
				c[j]=c[c.length-j-1];
				c[c.length-j-1]=d;
			}
			String h=new String(c);
			System.out.println(h);
		}
		System.out.println(s1[s1.length-1]);
		
//		for(int i=1;i<s1.length-1;i++)
//		{
//			String a=s1[i];
//			char c[]=a.toCharArray();
//			for(int j=c.length;j<0;j--)
//			{
//				System.out.print(c[j]);
//			}
////			String h=new String(c);
////			System.out.println(h);
//		}
//         
//		System.out.println(s1[s1.length-1]);
		
		
		
	}

}
