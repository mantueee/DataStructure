package com.empower.recursion;

public class Sumarray {

	public static void main(String[] args) {
		int[] a = { 3, 2, 5, 1, 6 };
		System.out.println(sum(a, 0, 5));
	}

	public static int sum(int[] arr, int temp, int length) {

		if (length == 0)
			return temp;
		temp = temp + arr[length - 1];
		temp = sum(arr, temp, length - 1);
		return temp;

	}
}
