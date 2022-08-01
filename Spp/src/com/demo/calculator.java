	package com.demo;
	import java.util.Scanner ;
	public class calculator {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number1");
	int num1 = sc.nextInt();
	System.out.println("enter the  number2");
	int num2= sc.nextInt();
	System.out.println("enter an operator(+,-,*,/):");
	 char opt = sc.next().charAt(0);
	
			
	switch(opt)
	{
	case '+': 
	
		System.out.println("num1+num2 : "+(num1+num2));
		break;
		
	case '*':
		System.out.println("num1*num2 : "+(num1*num2));
		break;
	case'-':
		System.out.println("num1-num2 : "+(num1-num2));
		break;
	case'/':
		System.out.println("num1/num2 : "+(num1/num2));
		break;
	default	:
		System.out.println("wrong");
	}


	}

	}