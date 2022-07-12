package string;

public class String18 {
	public static void main(String[] args) {
		String s= "uk57nkjbln65";
		char c[]=s.toCharArray();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=48;j<58;j++)
			{
				if(c[i]==j)
				{
					sum+=j-48;
				}
			}
		}
		System.out.println(sum);
	}

}
