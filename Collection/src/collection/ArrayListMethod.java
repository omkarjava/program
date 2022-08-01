    package collection;

    import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

    public class ArrayListMethod {

	public static void main(String[] args) {
	 ArrayList<Integer> al=new ArrayList<>();
	
	 al.add(20);
	 al.add(10);
	 al.add(30);
	 al.add(40);
	 al.add(50);
	 al.add(60);
	 al.add(10);
	  System.out.println(al);
	 
//	  al.add(3, 500);
//	  System.out.println(al);
	 //iterator 
	  System.out.println("Iterator :   ");
	  Iterator<Integer> itr=al.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next()+" ");
	  }
	  System.out.println();
	  
	 System.out.println("list Iterator in forward"); 
	 ListIterator<Integer> itrl=al.listIterator();
	  while(itrl.hasNext())
	  {
		  System.out.println(itrl.next()+" ");
	  }
	  System.out.println();
	  
	  System.out.println("list iterator in reverse");  
	  itrl=al.listIterator(al.size());
	 
	  while(itrl.hasPrevious())
	  {
		  System.out.println(itrl.previous()+" ");
	  }
	  
	  
	  
	  
	  
	  
	  
	  
//	  al.remove(3); //index as input
//	  System.out.println(al);
//	 
//	  al.clear();
//	  System.out.println(al);
//	 System.out.println(al.get(5));
//	 System.out.println(al.isEmpty());
//	 System.out.println(al.indexOf(500)+" "+al.lastIndexOf(20));
//	 
//	 System.out.println(al.contains(500));
//	 
//	 System.out.println(al.set(2, 3));
//	 System.out.println(al);
//	 ArrayList<Integer> list=new ArrayList<>(); 
//	 list.add(400);
//	 list.add(600);
//	 list.add(800);
//	 
//	 al.addAll(2,list);
//	 System.out.println(al);
//	 
//	 al.removeAll(list);
//	 System.out.println(al);
//
//	 al.retainAll(list);
//	 System.out.println(al);
//	 
//	 System.out.println(al.contains(list));
//	 
//	 ArrayList<Integer> list1=new ArrayList<>();
//	 
//	 list1.add(400);
//	 list1.add(200);
//	 list1.add(600);
//	 
//	 System.out.println(list.equals(list1));
//	 
	 
	 
	}

}
