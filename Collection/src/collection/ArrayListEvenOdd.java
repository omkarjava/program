package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEvenOdd {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter ArrayList");
        ArrayList<Integer>list=new ArrayList<>();
        
        list.add(39);
        list.add(2);
        list.add(6);
        list.add(38);
        
        System.out.println(list);
        int c=0;
        for(Integer i:list)
        {
          if(i%2==0)
          {
            c++;
          }
        }
        System.out.print(c);
        
    
    

	}

}
