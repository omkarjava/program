package arrayListToArray;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArraylist {

	public static void main(String[] args) {
		//int arr[]= {4,5,2,6,3,1,7,8,9,2};
		
		Integer arr[]= {4,5,2,6,3,1,7,8,9,2};
		
		
		ArrayList<Integer>al=new ArrayList<>(Arrays.asList(arr));
		
		
		//System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			al.add(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		//System.out.println(al);
		
	}

}
