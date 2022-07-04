package com.empower.recursion;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 5, 1, 6, 9 };
		mergeSort(a, 0, a.length - 1);
		for (int i : a) {
			System.out.println(i);
		}
	}

	public static void mergeSort(int[] arr, int s, int e) {
		if (s >= e) {
			return;
		}

		int m = s + (e - s) / 2;

		mergeSort(arr, s, m); // 0 0
		mergeSort(arr, m + 1, e); // 1 1 s= 0 e = 1
		merge(arr, s, e, m);
	}

	public static void merge(int[] a, int s, int e, int m) {
		int llength = m - s + 1;
		int rlength = e - m;
		int mainIndex = s;
		int[] left = new int[llength];
		int[] right = new int[rlength];

		for (int i = 0; i < llength; i++) {
			left[i] = a[mainIndex];
			mainIndex++;
		}

		for (int i = 0; i < rlength; i++) {
			right[i] = a[mainIndex];
			mainIndex++;
		}

		int i = 0;
		int j = 0;
		int k = s;

		while (i < llength && j < rlength) {
			if (left[i] > right[j]) {
				a[k] = right[j];
				j++;
				k++;
			} else {
				a[k] = left[i];
				i++;
				k++;
			}
		}

		while (i < llength) {
			a[k] = left[i];
			i++;
			k++;
		}
		while (j < rlength) {
			a[k] = right[j];
			j++;
			k++;
		}
	}
}
