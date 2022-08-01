package day2;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
        System.out.println("Table");
        int s=sc.nextInt();
        int n=1;
        while(n<=10)
        {
        	System.out.println(n+"*"+s+"="+s*n);
			n++;
        }
	}

}
