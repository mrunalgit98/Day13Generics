package com.generics;



	
	public class generics <T extends Comparable<T>>{
		
		
		T first;
		T second;
		T third;
		
		public static <T extends Comparable<T>> void compare(T first,T second, T third) {
			if(first.compareTo(second)>0 && first.compareTo(third)>0) {
				System.out.println("First is largest");
			}
			else if(second.compareTo(first)>0 && second.compareTo(third)>0) {
				System.out.println("Second is largest");
			}
			else
				System.out.println("Third is largest");
		}
		public void compare() {
			compare(this.first,this.second,this.third);
		}
		public generics(T first,T second,T third) {
			
			this.first=first;
			this.second=second;
			this.third=third;
		}
	}

