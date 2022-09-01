package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         ArrayList<Integer>list=new ArrayList<>();
         System.out.println("Enter 4 Numbers");
          
         for(int i=0;i<4;i++)
         {
        	 list.add(sc.nextInt());
        	
         }
         
//         do 
//         {
//        	list.add(sc.nextInt()) ;
//        	System.out.println("Y/N");
//         }
         
      
         
        System.out.println(list);
        int c=0;
        for(Integer i:list)
        {
        	if(i%2==0)
        	{
        		c++;
        	}
        }
        System.out.println(c);
         
	}

}
