package com.generics;

public class generics {

	public void findMax(Integer first,Integer second,Integer Third) {
		if(first.compareTo(second)>0 && first.compareTo(Third)>0){
			System.out.println("first is largest");
		}
		else if(second.compareTo(first)>0 && second.compareTo(Third)>0) {
			System.out.println("second is largest");
		}
		else
			System.out.println("third is largest");
	}
	
}
