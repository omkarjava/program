package string;

public class Ocurrances {

	public static void main(String[] args) {
		String s="java is a world world";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int d=0;
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j] && j<i)
				{
					break;
				}
				else if(c[i]==c[j] && j>=i)
				{
					d++;
				}
			}
			if(d>0)
			{
				System.out.println(c[i]+"="+d);
			}
		}

	}

}
