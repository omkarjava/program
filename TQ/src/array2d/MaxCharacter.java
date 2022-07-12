package array2d;

import java.util.Arrays;
import java.util.Scanner;

public class MaxCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter"+size+"Character");
		char a[]=new char[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		Arrays.sort(a);
        System.out.println(Arrays.toString (a));
        System.out.println("max cahracter:"+a[4]);
	}

}
