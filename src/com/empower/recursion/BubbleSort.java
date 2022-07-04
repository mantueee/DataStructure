package com.empower.recursion;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = new int[] { 3, 5, 6, 4, 1, 9, 8 };
		sort(a, 0, a.length-1);
		
		for (int i : a) {
			System.out.println(i);
		}
	}

	public static void sort(int[] a, int s, int e) {
		if (s >=e) {
			return;
		}
		for (int i = 0; i< e; i++) {
			if (a[i] > a[i+1]) {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		sort(a, s, e-1);

	}

	/*
	 * This is not Bubble sort public static void sort(int[] a) { for (int i =
	 * a.length - 1; i > 0; i--) { int maxind = i; for (int j = i - 1; j >= 0; j--)
	 * { if (a[j] > a[maxind]) { maxind = j; } } int temp = a[i]; a[i] = a[maxind];
	 * a[maxind] = temp;
	 * 
	 * System.out.println(a[i]);
	 * 
	 * } }
	 */
}
