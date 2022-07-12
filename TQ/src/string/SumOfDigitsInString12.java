package string;

public class SumOfDigitsInString12 {

	public static void main(String[] args) {
		String s="k2s5wf8e5wl6";
		char a[]=s.toCharArray();
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=48;j<58;j++)
			{
				if(a[i]==j)
				{
					sum=sum+(j-48);
				}
			}
		}
		System.out.println(sum);
	}

}
