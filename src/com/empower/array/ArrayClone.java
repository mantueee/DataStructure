package com.empower.array;

public class ArrayClone {

	public static void main(String[] args) {
		int [] a = {1,3,4};
		int[] b = a.clone();
		b[1] = 6;
		System.out.println("Printing a");
		for(int i : a) {
			System.out.println(i);
		}
		System.out.println("Printing b");
		for(int i : b) {
			System.out.println(i);
		}
		
	}
}
