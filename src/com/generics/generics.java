package com.generics;

public class generics {

	
	
	public void findMaxFloat(Float first,Float second,Float third) {
		if(first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
			System.out.println(" First is largest ");
		}
		else if(second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
			System.out.println(" Second is largest");
		}
		else
			System.out.println(" Third is largest");
	}
	}

