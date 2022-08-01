		package com.demo;
		import java.util.Scanner;
		public class odd {

		public static void main(String[] args) {
		Scanner sc= new Scanner (System.in)	;
	    System.out.println("Enter your choice");
	    int n =sc.nextInt();
	    switch(n/2) {
	    case 0: System.out.println("even");
	    break;
	    default:System.out.println("odd");
	    }
		}

		}

