package com.empower.recursion;

import java.util.ArrayList;

public class SubSequence {

	public static ArrayList<ArrayList<Integer>> res = new ArrayList();

	public static void main(String[] args) {
		// subSequence("abc", "", 0);
		ArrayList<Integer> a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		subArray2(a, new ArrayList<Integer>(), 0);
		for (ArrayList<Integer> arr: res) {
			System.out.println(arr);
		}
	}

	public static void subSequence(String s, String tempString, int ind) {

		if (ind >= s.length()) {
			System.out.println(tempString);
			return;
		}
		// include
		subSequence(s, tempString + s.charAt(ind), ind + 1);
		// dont include
		subSequence(s, tempString, ind + 1);
	}

	public static void subArray2(ArrayList<Integer> arr, ArrayList<Integer> temp, int ind) {

		if (ind == arr.size()) {
			res.add((ArrayList<Integer>) temp.clone());
			return;
		}
		temp.add(arr.get(ind));
		subArray2(arr, temp, ind + 1);
		temp.remove(arr.get(ind));
		subArray2(arr, temp, ind + 1);
	}

}
