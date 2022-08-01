package string;

public class DublicateWorld {

	public static void main(String[] args) {
		String s="good bye world good bye java";
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			int c=0;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					c++;
				}
			}
			if(c>0)
			{
			System.out.print(str[i]+" ");
			}
		}

	}

}
