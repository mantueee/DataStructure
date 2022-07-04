package com.empower.array;

public class FindElementInSortedNrotadArray {
	public static void main(String[] args) {
		int key = 3;
		int [] a = new int [] {5,6,7,1,2,3,4};
		//int [] s = new int [] {1,2,3,4,5,6,7};
		int pivot = getpivotPoint(a, 0, 6);
		int index = -1;
		if (a[pivot] == key)
			index = pivot;
		if (key > a[pivot])
			index = binarySearch(a, 0, pivot, key);
		else 
			index = binarySearch(a, pivot, 6, key);
		System.out.println(index);
	}

	public static int getpivotPoint(int[] arr, int l, int h) {
		// 3  4 5  6  7  1  2
		int m=(l+h)/2;
		
		if (h < l) 
			return -1;
		if (m > l && arr[m] <= arr[m-1])
			return m-1;
		if (m < h && arr[m] >= arr[m+1])
			return m;
		if (arr[m] <= arr[l] )
			return getpivotPoint(arr, l, m);
		 
			return getpivotPoint(arr, m+1, h);
	}
	
	public static int binarySearch(int []a, int l,int h, int k) {
		
		if (h < l)
			return -1;
		int m = (h+l)/2;
		
		if (k== a[m])
			return m;
		if (k > a[m])
		return 	binarySearch(a, m+1, h, k);
		return binarySearch(a, l, m-1, k);
		
	}

}
