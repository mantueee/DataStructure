package com.empower.recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {

	public static List<String> result = new ArrayList<>();

	public static void main(String[] args) {
		permutationofString("abc", 0);
		for (String a : result) {
			System.out.println(a);
		}
	}

	public static void permutationofString(String s, int ind) {
		if (ind >= s.length()) {
			result.add(s);
			return;
		}

		for (int i = ind; i < s.length(); i++) {
			char[] c = s.toCharArray();
			char temp = c[ind];
			c[ind] = c[i];
			c[i] = temp;
			permutationofString(new String(c), ind + 1);
			temp = c[ind];
			c[ind] = c[i];
			c[i] = temp;

		}
	}
}
