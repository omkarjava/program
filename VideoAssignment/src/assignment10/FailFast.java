package assignment10;

import java.util.ArrayList;

public class FailFast {

	public static void main(String[] args) {
		 ArrayList<Integer> fa=new ArrayList<>();
			
			fa.add(50);
			fa.add(42);
			fa.add(30);
			fa.add(26);
			fa.add(38);
			fa.add(23);
			fa.add(57);
			fa.add(62);
			fa.add(40);
			System.out.println(fa);
		
			for(Integer a:fa)
			{
				     if(a==50)
					fa.add(20);
			}
			System.out.println(fa);
			

	}

}
