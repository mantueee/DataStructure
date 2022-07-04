package com.empower.array;

public class Rotate {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		byReversalAlgo(a, 2, 7);
	}

	public static void rotate1(int[] arr, int d, int n) {
		int[] removedArr = new int[d];
		for (int i = 0; i < d; i++) {
			removedArr[i] = arr[i];
		}
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (i < n - d) {
				arr[i] = arr[i + d];
			} else {
				arr[i] = removedArr[j];
				j++;
			}
			System.out.println(arr[i]);
		}
	}

	public static void leftRotate(int[] arr, int d, int n) {

		for (int i = 0; i < d; i++) {
			int tmp = arr[0];
			int j = 0;
			for (; j <= n - d; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = tmp;

		}
	}

	public static void byReversalAlgo(int[] arr, int d, int n) {
		reverseArr(arr, 0, d-1);
		reverseArr(arr, d, n-1);
		reverseArr(arr, 0, n-1);
		printArr(arr);
	}

	public static void reverseArr(int[] arr, int start, int end) {

		while (start < end) {
			int tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
			start++;
			end--;
		}
		
	}
	
	public static void printArr(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
