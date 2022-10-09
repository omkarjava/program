package example;

public class StringAugust {

	public static void main(String[] args) {
		String s="Hi how are you students";
//		Input  : Hi how are you students 
//		Output  : Hi woh era uoy students
       
//		String a[]=s.split(" ");
//		for(int i=1;i<a.length-1;i++)
//		{
//		   String h=a[i];
//		   char c[]=h.toCharArray();
//		   for(int j=0;j<c.length;j++)
//		   {
//			    char f=c[j];
//				c[j]=c[c.length-1-j];
//				c[c.length-1-j]=f;
//		   }
//		    String a1=new String(c);
//			System.out.println(a);
//			
//		}
        
//		String s2="omkar phadatare";
//		String s1[]=s2.split(" ");
//		for(int i=0;i<s1.length;i++)
//		{
//			String d=s1[i];
//			char c[]=d.toCharArray();
//			for(int j=0;j<c.length/2;j++)
//			{
//				 char f=c[j];
//				c[j]=c[c.length-1-j];
//				c[c.length-1-j]=f;
//			}
//			String a1=new String(c);
//			System.out.println(a);
//		}
		
		//String s="omkar phadatare";
	
		String s1[]=s.split(" ");
		String d1=s1[0];
		System.out.println(d1);
		int i=0;
		for( i=1;i<s1.length-1;i++)
		{
			String d=s1[i];
			char c[]=d.toCharArray();
			for(int j=0;j<c.length/2;j++)
			{
				char f=c[j];
				c[j]=c[c.length-1-j];
				c[c.length-1-j]=f;
			}
			
			String r=new String(c);
			System.out.println(r);
		}
		System.out.println(s1[i]);

}
}
