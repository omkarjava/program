     package string;

     import java.util.Arrays;
     import java.util.Scanner;

     public class String10 {

	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Write World");	
//		char a=sc.next().charAt(0);
//		
		String s= "This is an umbrella";
		char ch[]=s.toCharArray();
		
		//char b[]=new char [ch.length];
		char d=' ';
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]<ch[j])
				{
				  d=ch[j];
				}
			}
		}
		System.out.println(d);
	}

}
