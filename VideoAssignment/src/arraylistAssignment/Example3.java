    package arraylistAssignment;

    import java.util.ArrayList;
import java.util.Iterator;
 
     public class Example3 {

	 public static void main(String[] args) {
		ArrayList<Integer>it=new ArrayList<>();
		
		it.add(12);
		it.add(15);
		it.add(16);
		it.add(19);
		it.add(21);
		it.add(14);
		it.add(13);
		it.add(12);
		it.add(17);
		it.add(11);
		System.out.println(it);
		for(int i=0;i<it.size();i++)
		{
			if(i==7)
			{
			    it.remove(i);
				it.add(i, 0);
			   
			}
		}
		System.out.println(it);
		
		

	}

}
