import java.util.ArrayList;
import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {

    String s="java is language";
		
	 char c[]=s.toCharArray();
	 ArrayList<String>a=new ArrayList<>();
	for(int i=0;i<c.length;i++)
	{
		if(c[i]=='a')
		{
			c[i]='A';
		
		}
	}
	System.out.println(Arrays.toString(c));	
	
	String m=String.valueOf(c);
	System.out.println(m);
	
	}

}
