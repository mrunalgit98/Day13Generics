package com.generics;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	generics s1;
	
	System.out.println("1.Integer\n 2.Float\n 3.String\n");
	System.out.println("enter your choice");
	int ch=sc.nextInt();
	
	switch(ch) {
	
	case 1:
	{
		System.out.println("enter first value");
		Integer first =sc.nextInt();
		
		System.out.println("enter second value");
		Integer second =sc.nextInt();
		
		System.out.println("enter third value");
		Integer third =sc.nextInt();
		s1= new generics<Integer>(first,second,third);
		s1.max();
		break;
	}
	
	case 2:
	{
		System.out.print(" Please enter the first value: ");
		Float first = sc.nextFloat();
		
		System.out.print(" Please enter the second value: ");
		Float second = sc.nextFloat();
		
		System.out.print(" Please enter the third value: ");
		Float third = sc.nextFloat();
		s1=new generics<Float>(first, second, third);
		s1.max();
		break;
	}
		case 3:
		{
			System.out.print(" Please enter the first value: ");
			String first = sc.next();
			
			System.out.print(" Please enter the second value: ");
			String second = sc.next();
			
			System.out.print(" Please enter the third value: ");
			String third = sc.next();
			s1=new generics<String>(first, second, third);
			s1.max();
			break;
		}
		default :
			System.out.println("wrong choice");
	}
	}
	
}

