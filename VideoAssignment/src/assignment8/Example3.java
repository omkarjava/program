package assignment8;

public class Example3 {

	public static void main(String[] args) {
		String s="df6ga8dga8vad9";
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			int a=0;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					a++;
					c[j]='#';
				}
			}
			if(c[i]!='#')
				System.out.println(c[i]+" : "+a);
		}
		
		

	}

}
