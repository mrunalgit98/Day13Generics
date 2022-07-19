package com.generics;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	generics obj=new generics();
	
	System.out.println("enter first value");
	int first=sc.nextInt();
	
	System.out.println("enter second value");
	int second=sc.nextInt();
	
	System.out.println("enter third value");
	int third=sc.nextInt();
	
	obj.findMax(first, second, third);
	
	
}
}
