package arrayListToArray;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylisttoArray {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		
		al.add(15);
		al.add(25);
		al.add(45);
		al.add(85);
		al.add(55);
		al.add(95);
		al.add(85);
		al.add(35);
		al.add(16);
		al.add(18);
		
		int arr[]=new int [al.size()];
		for(int i=0;i<al.size();i++)
		{
			arr[i]=al.get(i);
		}
		System.out.println(Arrays.toString(arr));
		
		Integer ai[]=new Integer[al.size()];
		al.toArray(ai);
		System.out.println("Object Array :"+Arrays.toString(ai)); //Arrays Utility Class
		

	}

}
