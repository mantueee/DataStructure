package com.empower.recursion;

public class ReverseString {

	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(reverse(s, "", s.length()));
	}

	public static String reverse(char[] s, int start, int end) {
		if (start >= end)
			return new String(s).toString();
		char c = s[start];
		s[start] = s[end];
		s[end] = c;
		return reverse(s, start + 1, end - 1);
	}

	public static String reverse(String s, String temp, int length) {
		if (length == 0)
			return temp;
		temp = temp + s.charAt(length - 1);
		return reverse(s, temp, length - 1);
	}
}
