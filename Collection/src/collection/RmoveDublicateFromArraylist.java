package collection;

import java.util.ArrayList;

public class RmoveDublicateFromArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(5);
		al.add(4);
		al.add(3);
		al.add(2);
		al.add(3);
		al.add(2);
		al.add(5);
		al.add(6);
		al.add(4);
		System.out.println(al);
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<al.size();i++)
		{
			int c=0;
			for(int j=0;j<al.size();j++)
			{
				if(al.get(i)==al.get(j)&&j<i)
				{
//					c++;
//					j='#';
					break;
				}
				if(al.get(i)==al.get(j)&&j>=i)
				{
					c++;
				}
				
			}
			if(c>0 )//&& i!='#')
			{
				a.add(al.get(i));
			}
			//System.out.println(c);
		}
		System.out.println(a);

	}

}
