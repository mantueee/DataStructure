package com.empower.recursion;

public class Quicksort {

	public static void main(String[] args) {
		int a[] = new int[] { 4, 1, 3, 5, 2 };
		quicksort(a, 0, a.length-1);
		for (int i : a) {
			System.out.println(i);
		}
	}

	public static void quicksort(int[] a, int s, int e) {
		if (s > e) {
			return;
		}
		int p = partition(a, s, e);
		quicksort(a, s, p - 1);
		quicksort(a, p + 1, e);
	}

	public static int partition(int a[], int s, int e) {
		int pivot = a[s];
		int count = 0;
		for (int i = s + 1; i <= e; i++) {
			if (pivot > a[i]) {
				count++;
			}
		}
		int pivotindex = count + s;
		int temp = a[pivotindex];
		a[pivotindex] = a[s];
		a[s] = temp;
		int i = s;
		int j = e;

		while (i < pivotindex && j > pivotindex) {
			while (a[i] < pivot) {
				i++;
			}
			while (a[j] > pivot) {
				j--;
			}

			if (i < pivotindex && j > pivotindex) {
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
		return pivotindex;
	}
}
