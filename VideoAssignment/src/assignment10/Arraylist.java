    package assignment10;

    import java.util.ArrayList;

    public class Arraylist {

	public static void main(String[] args) {
	ArrayList<String>al=new ArrayList<String>();
		
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
	ArrayList<String>a=new ArrayList<String>();
		for(int i=0;i<al.size();i++)
		{
			  if(!a.contains(al.get(i)))
               {
    	         a.add(al.get(i));
               }
		}
        System.out.println(a);
	}

}
