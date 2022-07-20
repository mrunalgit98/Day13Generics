package com.generics;



	
	public class generics <T extends Comparable<T>>{
		
		
		T first;
		T second;
		T third;
		
		public  generics(T first,T second,T third) {
			this.first=first;
			this.second=second;
			this.third=third;
		}
		public T max() {
			return generics.max(first,second,third);
		}
		
		public static <T extends Comparable<T>> T max(T first,T second, T third) {
			if(first.compareTo(second)>0 && first.compareTo(third)>0) {
				System.out.println("First is largest");
			}
			else if(second.compareTo(first)>0 && second.compareTo(third)>0) {
				System.out.println("Second is largest");
			}
			else
				System.out.println("Third is largest");
			return third;
		}
		public static String testMaximum(String first,String second,String third) {
			if(first.compareTo(second)>0 && first.compareTo(third)>0) {
				System.out.println("First is largest");
			}
			else if(second.compareTo(first)>0 && second.compareTo(third)>0) {
				System.out.println("Second is largest");
			}
			else
				System.out.println("Third is largest");
			return third;
		}
		public static <T> void printMax(T first,T second,T third,T max) {
			System.out.printf("Max of %s,%s and %s is %s\n",first,second,third,max);
		}
	}
	
