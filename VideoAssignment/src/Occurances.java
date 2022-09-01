
public class Occurances {

	public static void main(String[] args) {
		String s="java is good";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int v=0;
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j]&&j<i)
				{
					break;
				}
				else if(c[i]==c[j]&& j>=i)
				{
					v++;
				}
			}
			if(v!=0)
			{
				System.out.println(c[i]+"="+v);
			}
		}

	}

}
