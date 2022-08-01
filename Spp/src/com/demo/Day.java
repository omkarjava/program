        package com.demo;

        import java.util.Scanner;

        public class Day {

        public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("choice the number");
	    int day = sc.nextInt();
	    switch(day)
	    {
	    case 1:System.out.println("monday");
	    break;
	    case 2:System.out.println("tuesday");
	    break;
	    case 3:System.out.println("thirsday");
	    break;
	    case 4:System.out.println("saturday");
	    break;
	    case 5:System.out.println("sunday");
	    break;
	    case 6:System.out.println("friday");
	    break;
	    default: System.out.println("sorry");
	    }
        }

        }
