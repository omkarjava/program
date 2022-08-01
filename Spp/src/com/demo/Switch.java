	package com.demo;  

	import java.util.Scanner;

	public class Switch {

	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in)	;
    System.out.println("Enter your choice");
    String input=sc.next();
    switch(input) {
    
    case "happy" :System.out.println(" HAPPY ");
    break;
    case "new": System.out.println(" NEW ");
    break;
    case "year" :System.out.println("YEAR");
    break;
    default: System.out.println("welcome");
    }
	}

	}

