package com.empower.recursion;

public class CheckifArrayIssorted {
	public static void main(String[] args) {
		int a[] = { 1, 3, 6 ,2};
		System.out.println(issorted(a, a.length-1));
	}

	public static boolean issorted(int[] arr, int length) {
		if (length == 0)
			return true;
		if (arr[length] < arr[length - 1]) {
			return false;
		}

		return issorted(arr, length-1);
	}
}
