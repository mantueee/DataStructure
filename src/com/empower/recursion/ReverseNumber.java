package com.empower.recursion;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println(reverse(1234, 0));
	}

	public static int reverse(int num1, int num2) {
		if (num1 == 0)
			return num2;
		num2 = num2 * 10 + num1 % 10;
		num1 = num1 / 10;
		return reverse(num1, num2);
	}
}
