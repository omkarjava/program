    package collection;

    import java.util.ArrayList;

    public class ArraylistRemoveDublicate {

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
			if(!a.contains(al.get(i)))
			{
				a.add(al.get(i));
			}
         
		}
		System.out.println(a);
		for(Integer s:a)
		{
			System.out.print(s+"   ");
		}
		
	}

}
