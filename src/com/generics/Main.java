package com.generics;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	generics obj=new generics();
	
	System.out.println("enter first value");
	String first=sc.next();
	
	System.out.println("enter second value");
    String second=sc.next();
	
	System.out.println("enter third value");
	String third=sc.next();
	
	obj.findMaxString(first, second, third);
	
}
}
