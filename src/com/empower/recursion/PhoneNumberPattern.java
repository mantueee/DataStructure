package com.empower.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumberPattern {

	public static List<String> result = new ArrayList<>();
	public static Map<Integer, String> map = new HashMap<>();

	public static void main(String[] args) {
		map.put(2, "abc");
		map.put(3, "def");
		phoneLetter("23", "", 0);

		for (String s : result) {
			System.out.println(s);
		}
	}

	public static void phoneLetter(String num, String temp, int ind) {
		if (ind >=num.length()) {
			result.add(temp);
			return;
		}

		int n = Integer.parseInt(String.valueOf(num.charAt(ind)));
		String s = map.get(n);

		for (char c : s.toCharArray()) {
			temp = temp + c;
			phoneLetter(num, temp, ind + 1);
			temp = temp.substring(0, ind);
		}
	}
}
