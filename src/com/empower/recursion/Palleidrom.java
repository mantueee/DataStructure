package com.empower.recursion;

public class Palleidrom {
	public static void main(String[] args) {
		System.out.println(checkPalleidrom("noona", 0, 4));
	}

	public static int checkPalleidrom(String s, int start, int end) {
		if (start >= end)
			return 1;
		if (s.charAt(start) != s.charAt(end))
			return 0;

		return checkPalleidrom(s, start + 1, end - 1);
	}
}
