package com.generics;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	generics obj=new generics();
	
	System.out.println("enter first value");
	float first=sc.nextFloat();
	
	System.out.println("enter second value");
    float second=sc.nextFloat();
	
	System.out.println("enter third value");
	float third=sc.nextFloat();
	
	obj.findMaxFloat(first, second, third);
	
}
}
