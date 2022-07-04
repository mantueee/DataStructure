package com.empower.recursion;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static Map<Integer, String> map = new HashMap<>();
	public static int sum = 5;
	public static int count = 0;
	
	public static void main(String[] args) {
		int a[] = new int[] { 3, 8, 2, 5, 4, 1 };
		subSeq("abc", "", 0);
		System.out.println(count);
	}

	public static void subSeq(String s, String temp,int ind) {
		if (ind >= s.length()) {
			System.out.println(temp);
			return;
		}
		subSeq(s, temp + s.charAt(ind), ind+1);
		subSeq(s, temp, ind+1);
	}
}
