    package example;
    public class StringAverage {
	public static void main(String[] args) {
		String s="s15w8s2s6s4";
		char a[]=s.toCharArray();
		int z=0;
		int c=0;
//		int ave=0;
		for(int i=0;i<a.length;i++)
		{
			for(char j='0';j<'9';j++)
			{
				if(a[i]==j)
				{
					z=(z*10)+a[i]-48;
//					c++;
//					ave=z/c;	
				}
				 else if(a[i]>'a'&& a[i]<'z')
				 {
					c+=z;
					z=0;
				 }	
			}
		}
		System.out.println(z);
	//	System.out.println(ave);
		
//   String tem=" ";
//   int sum=0;
//   for(int)
	}

}
