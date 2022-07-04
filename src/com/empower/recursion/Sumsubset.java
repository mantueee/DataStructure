package com.empower.recursion;

import java.util.ArrayList;

public class Sumsubset {

	public static int num = 5;
	public static ArrayList<ArrayList<Integer>> numarr =  new ArrayList<>();

	public static void main(String[] args) {
		int a[] = new int[] { 3, 8, 2, 5,4,1 };
		System.out.println(sumsubset(a, 0, 0, new ArrayList<Integer>()));
	}

	public static boolean sumsubset(int[] arr, int temp, int ind, ArrayList<Integer> n) {
		if (temp == num) {
			numarr.add((ArrayList<Integer>) n.clone());
			return true;
		}
		if (temp > num)
			return false;
		if (ind >= arr.length) {
			return false;
		}
		n.add(Integer.valueOf(arr[ind]));
		boolean include = sumsubset(arr, temp + arr[ind], ind + 1, n);
		n.remove(Integer.valueOf(arr[ind]));
		boolean exclude = sumsubset(arr, temp, ind + 1, n);
		return include || exclude;
	}
}
